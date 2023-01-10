
//;earning git

public class Uid{

   private static int one_uid = 0;
   private int uid ;
   
    public  Uid(){
   
      uid = ++ one_uid;
  
   
   }
   
   public static void main(String[] args){
     Uid one = new Uid();
       Uid two = new Uid();
         Uid three = new Uid();
           Uid four = new Uid();
           one_uid = 5;
   System.out.println("Finished creating objects");
   
   }
}