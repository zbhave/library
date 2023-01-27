import java.util.ArrayList;

public class Userlist {
   private static int id = 0;
   
   public ArrayList <User> UserList = new ArrayList<>();
   public void createUserList() {
   
       User sunil = new User("Sunil Bhave", 59, 
            "138 Akatarawa road, Upper Hutt");
            UserList.add(sunil);
       User advait = new User("Advait Zorba Bhave", 19,
            "138 Akatarawa road, Upper Hutt");
            UserList.add(advait);
       User amy = new User("Amy Lois Pollard", 20,
             "33a Pitt Street, Dunedin");
             UserList.add(amy);
       User harlan = new User("Harlan Rae", 19,
             "74 Gladstone road, Dunedin");
             UserList.add(harlan);
       User eva = new User("Eva Levack", 18, 
            "20 Talavera terrace, Wellington");
            UserList.add(eva);          
      
     
   } 
   
   
   public boolean validUsersId(int UsersId) {
      
      int i;
      User user;
      
      for(i = 0; i < UserList.size(); i++) {
         user = UserList.get(i);
         if(user.getUserId() == UsersId)
            return true;
      }
      return false;
      
   } 
  
}     