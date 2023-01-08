import java.util.*;

public class Exercício1{

public static void main(String[]args){

 Scanner sc = new Scanner(System.in);

int inteiro[] = new int[8];
int positivo[] = new int[8];
int negativo[] = new int[8];

int indp =0,indn=0;

for(int indice = 0;indice < 8;indice ++){
       
    System.out.println("Digite um número:");
    inteiro[indice] = sc.nextInt();

}
for(int indice = 0;indice <8;indice ++){

      if(inteiro[indice]>0){
        positivo[indp]=inteiro[indice];
        indp++;

      }else{
         
         negativo[indn]=inteiro[indice];
         indn++;
      }


}for(int indice =0;indice < 8;indice ++){

    if(positivo[indice]!=0){ 
        System.out.printf(" " + positivo[indice]); 

}

System.out.println("\n"); 
    //mostrar o vetor negativo 
    for(int indice : negativo){ 
        if(indice != 0){ 
            System.out.printf(" " + indice);

}

    sc.close();

    }
}
}
}