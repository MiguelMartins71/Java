import java.util.Scanner;

public class Exercício8 {
 public static void main(String args[]) {
 Scanner sc = new Scanner(System.in);
 
 int aux=8,aux1=1;
 int[] vet = new int[16];
 int[] vet1= new int[16];
 for(int i=0;i<16;i++){
 vet[i]=aux1;
 aux1++;
 }
 for(int i=0;i<8;i++){
 vet1[i]=vet[aux];
 aux++;
 }
 aux=0;
 for(int i=8;i<16;i++){
 vet1[i]=vet[aux];
 aux++;
 }
 for(int i=0;i<16;i++){
 System.out.println("Vetor trocado"+i+'='+vet1[i]);
 }
 }
}