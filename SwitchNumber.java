import java.util.Scanner;
import java.util.Random;


public class SwitchNumber {

   public static void main() {
 
      
      Scanner scan = new Scanner(System.in);
      int number;
      System.out.println("Enter a number: ");
      number = scan.nextInt();
      if(number <0) {
          System.out.print("minus");
          number = number* -1;
      }
      
      
      
   
   }
   
   public static String Switchless19(int num) {
      
      String stringNum;
      
      switch(num) {
         
         case 0:
             stringNum = " ";
             break;
           
        case 1:
              stringNum = "one ";
              break;
        
        case 2:
             stringNum = "two ";
             break;
        
        case 3:
             stringNum = "three";
             break;
        
       case 4:
             stringNum = "four";
             break;
         
       case 5:
            stringNum = " five";
            break;
         
         case 6:
            stringNum = " six";
            break;
            
         case 7:
            stringNum = " seven";
            break;
            
         case 8:
            stringNum = " eight";
            break;
            
         case 9:
            stringNum = " nine";
            break;
         
         case 10:
            stringNum = " ten";
            break;
         
         case 11:
            stringNum = " eleven";
            break;
            
         case 12:
            stringNum = " twelve";
            break;
            
         case 13:
            stringNum = " thirteen";
            break;
            
         case 14:
            stringNum = " fourteen";
            break;
         
         case 15:
            stringNum = " fifteen";
            break;
         
         case 16:
            stringNum = " sixteen";
            break;
            
         case 17:
            stringNum = " seventeen";
            break;
            
         case 18:
            stringNum = " eighteen";
            break;
            
         case 19:
            stringNum = " nineteen";
            break;
         
         default:
               stringNum = "";
      
      }
     return stringNum; 
       
    }  
    
    public static String Switch20Plus(int num) {
    
      int quotient;
      int remainder;
      String lt19;
      String gt20;
      
      if( num <= 19) {
         gt20 = Switchless19(num);
      }
      else {
         quotient = num/10;
         remainder = num%10;
         
         switch(quotient) {
            
            case 2:
             gt20 = "twenty";
             break;
           
           case 3:
              gt20 = "thirty";
              break;
              
           case 4:
               gt20 = "forty";
               break;
           
           case 5:
               gt20 = "fifty";
               break;
           
           case 6:
               gt20 = "sixty";
               break;
           
           case 7:
               gt20 = "seventy";
               break;
           
           case 8:
               gt20 = "eighty";
               break;
           
           case 9:
               gt20 = "ninety";
               break;
           
           default:
              gt20 = " ";
          }
         lt19 = Switchless19(remainder);
   
     }
      return gt20;
    
   }  
   
   public static void switchPlus100(int num) {
   
      int quotient;
      int remainder;
      int units = 0, tens = 0, hundreds = 0, thousands = 0;
      
      units = num%10;
      tens = num/10;
      
      if(tens >= 10) {
         hundreds = tens / 10;
         tens = tens % 10;
      }
      if (hundreds >= 10) {
         thousands = hundreds / 10;
         hundreds = hundreds % 10;
      }
      
      
      if(thousands != 0) {
          System.out.print(Switchless19(thousands) + " thousand");
      }
      
      if(hundreds != 0) {
          System.out.print(Switchless19(hundreds) + " hundred");
      }
      
      if(tens != 0) {
          System.out.print(" and " + Switchless19(tens * 10 + units));
      }
      else {
          System.out.print(" and");
      }
      
      if( units != 0) {
          System.out.print(Switchless19(units));
      }
   
   }
   
}