import java.util.* ;
import java.io.*;

public class Recursion{
    
    
    
    public static int sum(int num){
       int total;
       if (num > 1) 
          total = num + sum(num -1);
       else 
          total = num;
          
       return total;
    }
    
    public static void main(String[] args){
       int    i, j;
       //System.out.println(String.format("The total of %d is %d", i, sum(i)));
       
       int [][] arr2d = new int[5][4];
       for (i =0; i < 5; i++) 
          for (j = 0; j < 4; j++) 
            arr2d[i][j] = i+1 *j+1;
      /* 
         arr2d[0][0] = 1;
         arr2d[0][1] = 2;
         arr2d[1][0] = 3;
         arr2d[1][1] = 4;
         arr2d[0][2] = 5;
         arr2d[2][0] = 6;
         arr2d[1][2] = 7;
         arr2d[2][1] = 8;
         arr2d[2][2] = 9;
        */
         

        
         for( int k = 0; k < 5; k++) {
            for( j = 0; j < 4; j++) { 
               System.out.print(arr2d[k][j] + " ");
            }
            System.out.println();
         }
    } 
    
    public static double arrAvg(int arr1[]) { 
    
      int length = arr1.length;
      int sum = 0;
      double average;
      int i;
      
      for(i = 0; i < length; i++) {
         sum = sum + arr1[i];
      }
      
      average = sum/length;
      
      return average;
    
    }  
    
}
