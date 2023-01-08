
import java.util.Scanner;
public class Exercício5 {
 public static void main(String args[]) {
 Scanner sc = new Scanner(System.in);


 System.out.println("Digite o tamanho do Vetor:");
 
 
 int x = sc.nextInt();
 
 int[] vetora = new int[x];
 
 int[] vetb = new int[x];
 int soma = 0, aux = 0, aux2=0;
 for (int i = 0; i < x; i++) {
 System.out.println("digite o valor do vetor A" + (i));
 vetora[i] = sc.nextInt();
 }
 vetb[0] = vetora[0];
 vetb[1] = 2 * vetora[1];
 for (int i = 2; i < x; i++) {
 soma = 0;
 aux = i;
 aux2=1;
 while (aux!=1){
 soma=(aux+1)*vetora[aux2]+soma;
 aux--;
 aux2++;
 }
 vetb[i]=soma+2*vetora[i];
 }
 for(int i=0;i<x;i++){
 System.out.println("vetor B["+i+"]="+vetb[i]);
 }
 }
}