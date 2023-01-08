import java.util.Scanner;
public class Exercício6 {
 public static void main(String args[]) {
 Scanner sc = new Scanner(System.in);
 
 
 double[] vet = new double[10];
 
 
 double[] vet1 = new double[10];
 
 char[] vet2 = new char[10];
 
 double[] vet3= new double [10];
 for(int i=0;i<10;i++){
 System.out.println("Digite o valor do primeiro vetor ["+i+"]");
 vet[i]=sc.nextDouble();
 }
 for(int i=0;i<10;i++){
 System.out.println("Digite o valor do segundo vetor["+i+"]");
 vet1[i]=sc.nextDouble();
 }
 for(int i=0;i<10;i++){
 System.out.println("Digite a operação ["+i+"]");
 vet2[i]=sc.next().charAt(0);
 switch(vet2[i]){
 case '+':
 vet3[i]=vet[i]+vet1[i];
 break;
 case '-':
 vet3[i]=vet[i]-vet1[i];
 break;
 case '*':
 vet3[i]=vet[i]*vet1[i];
 break;
 case '/':
 vet3[i]=vet[i]/vet1[i];
 break;
 }
 }
 for(int i=0;i<10;i++){
 System.out.println("Resultado do vetor será ="+"["+i+"]");
 System.out.println(vet3[i]);
 }
 }
}