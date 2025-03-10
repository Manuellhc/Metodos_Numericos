

import java.util.Scanner;


public class Gauss {

  
    public static void main(String[] args) {
        int n,m;
       
        Scanner scanner = new Scanner(System.in);
        n=scanner.nextInt();
       
        int [][] matriz=new int [n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
               matriz[i][j]=scanner.nextInt();
               
            }   
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(j>=n){
                    System.out.println(matriz[i][j]+"/n");
                }else{
                    System.out.print(matriz[i][j]+" ");
                }
                
            }
        }
        
    }
    
}
