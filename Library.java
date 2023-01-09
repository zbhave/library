

//learning git
import java.util.ArrayList;



public class Library{


   final static int ISSUE_BOOK = 1;
   final static int RETURN_BOOK = 2;
   final static int ADD_USER = 3;
   final static int ADD_BOOK = 4;
   final static int EXIT_MENU = 0;
   
   BookList catalogue = new BookList();
   Userlist users = new Userlist();

   public Library() {  
  
     catalogue.createBookList();
     users.createUserList();
   }

//  public static ArrayList <Book> catalogue = new ArrayList<>();
  
//  private static int uid = 0;

  
  public static void main(String[] args){
  
     Library lib = new Library();
     
     while (true) {
       int option = getMenu();
       switch (option) {
           case ISSUE_BOOK:
               issueBook(); 
           break;
           
           case RETURN_BOOK:
               returnBook();
           break;
           
           case ADD_USER:
                addUser(); 
           break;
           case ADD_BOOK:
                addBook();
           break;
           default: 
               System.out.println(String.format("[%d] Thank you for using the Library system. Exiting - good bye", option));
       }
       if (option == EXIT_MENU) 
          break;
     }
   }
/*     
     
     bookId = 760;
     location = getLibraryBook(catalogue, bookId);
     //if ((location = getLibraryBook(catalogue, bookId)) >= 0) 
     if(location >= 0)
        System.out.println(String.format("Book %s in the catalogue", catalogue.BookList.get(location).getTitle()));
     else
           System.out.println(String.format("Book %d not found", bookId));  
           
     setBookStatus(catalogue, location, LibraryBook.Status.ISSUED, 3);
     
  }
  
*/
  
  
  
   public static int getMenu(){
       return 0;
   }
   
   public static void issueBook() {
   }
   
   public static void returnBook() {
   }
   
   public static void addUser(){
   }
   
   public static void addBook() {
   }
   
   
   public static int getLibraryBook(BookList catalogue, int bookid) {
   
       int i;
       for(i = 0; i < catalogue.BookList.size(); i++) {
          if (catalogue.BookList.get(i).getBookUid() == bookid) 
             return i;
       }
       return -1;
   } 
   
   public static void setBookStatus(BookList catalogue, int location, LibraryBook.Status newStatus, int uid) {
       LibraryBook book = new LibraryBook();
       book = catalogue.BookList.get(location);
       book.setBookStatus(newStatus, uid);
       
       catalogue.BookList.set(location, book);
       
   }
  
   
   
    
 /*  public static void bookSearch(String searchString, int numCopies) {
   
      int i = 0;
      int size = catalogue.size();
      Book writer;
      int copies = 0;
      
      while(i < size) {
      
         writer = catalogue.get(i);
         if(writer.getAuthor().equals(searchString) || writer.getTitle().equals(searchString)) {
            System.out.println(writer.getTitle());
            copies++;
         }
         if(copies == numCopies) {
            break;
         }
         i++; 
      }    
   } */    
}