import java.util.Scanner;
public class Exercício3{
 public static void main(String args[]){
 int []vetor=new int[10];
 
 int []vetor1=new int[10];
 
 
 Scanner sc=new Scanner(System.in);
 for(int i=0;i<10;i++){
 System.out.println("digiteo valor do vetor X");
 vetor[i]=sc.nextInt();
 if(vetor[i]!=0 && vetor[i]%2==0){
 vetor1[i]=vetor[i]/2;
 }
 if(vetor[i]!=0 && vetor[i]%2!=0){
 vetor1[i]=vetor[i]*3;
 }
 }
 for(int i=0;i<10;i++){
 System.out.println("Vetor B"+(i+1)+" ="+vetor1[i]);
 }
 }
}