import java.util.Scanner;
import java.util.Random;
public class Exercício7 {
 public static void main(String args[]) {
 Scanner sc = new Scanner(System.in);
 Random gerador= new Random();
 int[] vet = new int[12];
 
 
 int start=0,end=0,soma=0;
 
 
 for(int i=0;i<12;i++){
 
 
 
    vet[i]=gerador.nextInt(1,100);
 
 
    System.out.println("valor do vetor"+i+"="+vet[i]);
 }
 System.out.println("digite o valor de x de 0 a 11");
 start=sc.nextInt();
 while(start<0 && start>11){
 System.out.println("digite o valor de x de 0 a 11");
 start=sc.nextInt();
 }
 System.out.println("digite o valor de y de 0 a 11");
 end=sc.nextInt();
 while(end<0 && end>11){
 System.out.println("digite o valor de x de 0 a 11");
 end=sc.nextInt();
 }
 if(start<end){
 for(int i=start;i<=end;i++){
 soma=vet[i]+soma;
 }}
 else{
 for(int i=end;i<=start;i++){
 soma=vet[i]+soma;
 }
 }

 System.out.println(soma);

 }
}
