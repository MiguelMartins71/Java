 Integrantes do grupo : Lucas Antônio Gregório Pidner, Miguel Henrique Martins Carvalho;

import java.util.Scanner;

public class termo {

    public static final String cinza = "\033[0;39m";
    public static final String amarelo = "\033[1;93m";
    public static final String verde = "\033[1;92m";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        System.out.println("Termo: Digite uma palavra de cinco letras");
        String escolharesposta = ReturnRandomWord();
        char[] resposta = new char[5];
        for (int i = 0; i < 5; i++)
            resposta[i] = escolharesposta.charAt(i);
        char[] input = new char[5];
        boolean bool = false;
int tentativas=0;
        
        while (!bool && tentativas<=6) {
            tentativas++;
            String R1 = sc.nextLine().toLowerCase();
            while (R1.length() < 5) {
                R1 = sc.nextLine().toLowerCase();
            }
            for (int i = 0; i < 5; i++) { // input palavra para char
                resposta[i] = escolharesposta.charAt(i);
                input[i] = R1.charAt(i);
            }
            if (PrintWordWithColor(input, resposta)){
                bool = true;
            }
            if(tentativas==6){
System.out.println("A palavra correta era " + escolharesposta);
        }  
        }
   if(bool){
    System.out.println("Parabéns!! Você acertou a palavra");
   }
   
    }

    public static boolean PrintWordWithColor(char[] inputpalavra, char[] palavracerto) {
        boolean certo = true;
        char[] respostatemp = palavracerto;
        int[] corletra = new int[5]; // 0 cinza, 1 amarelo, 2 verde

        for (int i = 0; i < 5; i++) { // verifica se há alguma posição certa + letra (verde)
            if (inputpalavra[i] == respostatemp[i]) {
                respostatemp[i] = '-';
                corletra[i] = 2;
            } else
                certo = false;
        }

        for (int j = 0; j < 5; j++) { // verifica se há alguma letra certa (amarela)
            for (int k = 0; k < 5; k++) {
                if (inputpalavra[j] == respostatemp[k] && corletra[j] != 2) {
                    // se essa letra ainda não estiver verde e corresponder a alguma outra letra
                    corletra[j] = 1;
                    respostatemp[k] = '-';
                }
            }
        }

        for (int m = 0; m < 5; m++) {
            if (corletra[m] == 0)
                System.out.print(inputpalavra[m]);
            if (corletra[m] == 1)
                System.out.print(amarelo + inputpalavra[m] + cinza);
            if (corletra[m] == 2)
                System.out.print(verde + inputpalavra[m] + cinza);
        }
        System.out.println("");
        return certo;
    }

    public static String ReturnRandomWord() {
        String[] listaresp = { "cabra", "falar", "corre", "bomba", "corte", "junto", "desta", "penta", "urubu", "arara", "flama", "inves","morsa", "jarro", "chute", "monte", "leite", "nariz", "zebra", "picar", "aulas" };
        return listaresp[(int) (Math.random() * (listaresp.length - 1))]; // retorna uma palavra aleátoria
    }
} 

import java.io.IOException;
import java.util.Random;
public class termo{
    public static void main(String [] args)throws IOException{
     Dicionario dic = new Dicionario(2326, "palavrasJogo.txt");
    Random rd = new Random();
    String sorteio;
    sorteio = dic.sortearPalavra(rd.nextInt(1000));
    System.out.println("Palavra: " + sorteio);
    System.out.println(dic.checarPalavra(sorteio));
    }
}