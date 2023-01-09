import java.util.ArrayList;

public class Userlist {
   private static int id = 0;
   
   public ArrayList <User> UserList = new ArrayList<>();
   public void createUserList() {
   
       User sunil = new User("Sunil Bhave", 59, 
            "138 Akatarawa road, Upper Hutt");
       User advait = new User("Advait Zorba Bhave", 19,
            "138 Akatarawa road, Upper Hutt");
       User amy = new User("Amy Lois Pollard", 20,
             "33a Pitt Street, Dunedin");
       User harlan = new User("Harlan Rae", 19,
             "74 Gladstone road, Dunedin");
       User eva = new User("Eva Levack", 18, 
            "20 Talavera terrace, Wellington");          
      
     
   }  
  
}     