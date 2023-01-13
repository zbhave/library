// learning git
//
public class User {

   private String name = new String("empty");
   
   private int age = 0;
   
   private String address = new String("none");
   
   private static int id_gen = 0;
   private int userId;

   
   public User() {
   
      userId = ++id_gen;
      
   }
   
   public User( String theName,
          int theAge, String theAddress) {
      this();
      name = theName;
      age = theAge;
      address = theAddress;
   } 
   
   
   public String getName() {
      return name;
   }
   
   public void setName(String theName) {
      name = theName;
   }
   
   
   
   public int getAge() {
      return age;
   }
   
   
   public void setAge(int theAge) {
      age = theAge;
   }
   
   
   
   
   public String getAddress() {
      return address;
   }
   
   public void setAddress(String theAddress) {
      address = theAddress;
   }   
         
   
    public String toString() {
      return("Name: " + name + "\nAge: " + age + "\nAddress: " + address + "\nUserID: " + userId);
   }
 
 
    public int getUserId() {
      return userId;
   }

}