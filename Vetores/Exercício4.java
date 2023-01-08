import java.util.*; 
 
public class Exercício4 {   
public static void main(String [] args){ 
  
   int[]vetA = new int[25]; 
   int[]vetB = new int[25]; 
   int[]vetI = new int[50]; 
   Scanner leitura = new Scanner(System.in); 
 
   for(int i=0; i<25; i++){ 
       System.out.println("Digite dois números"); 
       vetA[i] = leitura.nextInt(); 
       vetB[i] = leitura.nextInt(); 
   } 
  
   for(int i=0,j=0; i < 25; i++, j+=2){ 
       vetI[j] = vetA[i]; 
       vetI[j+1] = vetB[i]; 
   } 
 
  
   for(int i=0; i < 50; i++){ 
       System.out.printf(" " + vetI[i]); 
   } 
    
    
    leitura.close(); 
   }  
}