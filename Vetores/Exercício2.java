import java.util.Scanner;
public class Exercício2{
 public static void main(String args[]){
 int []vet=new int[10];
 int []vet1=new int[10];
 int []vet2=new int[10];
 
 
 Scanner sc=new Scanner(System.in);
 
 
 
 for(int i=0;i<10;i++){
 System.out.println("Digite aqui o vetor X");
 vet[i]=sc.nextInt();
 }
 
 
 for(int i=0;i<10;i++){
 System.out.println("Digite aqui o vetor Y");
 vet1[i]=sc.nextInt();
 }
 
 
 for(int i=0;i<10;i++){
 System.out.println("Soma de X+Y");
 vet2[i]=vet[i]+vet1[i];
 System.out.println("="+vet2[i]);
 }
 
 
 for(int i=0;i<10;i++){
 System.out.println("Produto X e Y");
 vet2[i]=vet[i]*vet1[i];
 System.out.println("="+vet2[i]);
 }
 }
}
