

//learning git
import java.util.ArrayList;
import java.util.Scanner;


public class Library{


   final static int ISSUE_BOOK = 1;
   final static int RETURN_BOOK = 2;
   final static int ADD_USER = 3;
   final static int ADD_BOOK = 4;
   final static int LIST_BOOKS = 5;
   final static int LIST_USERS = 6;
   final static int EXIT_MENU = 0;
   
   static BookList catalogue = new BookList();
   static Userlist users = new Userlist();

   public Library() {  
  
     catalogue.createBookList();
     users.createUserList();
   }

//  public static ArrayList <Book> catalogue = new ArrayList<>();
  
//  private static int uid = 0;

  
  public static void main(String[] args){
  
     Library lib = new Library();
     int option = -1;
     
     while (option != EXIT_MENU) {
       switch (option = getMenu()) {
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
           
           case LIST_BOOKS:
                listBooksAndGetBookId(catalogue);
           break;
           
           case LIST_USERS:
                listUsers(users);
           break;
           
           
           default: 
     
       } // end switch
      
     }// end while
     System.out.println(String.format("[%d] Thank you for using the Library system. Exiting - good bye", option));
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
      Scanner menuInput = new Scanner(System.in);
      int option = -1;
      String tmp;
      while (option == -1) {
         System.out.println("-----------------Library Menu------------------");
         System.out.println("| 1. Issue a book                             |"); 
         System.out.println("| 2. Return a book                            |");
         System.out.println("| 3. Add a user                               |");
         System.out.println("| 4. Add a book                               |");
         System.out.println("| 5. List Books                               |");
         System.out.println("| 6. List Users                               |");
         System.out.println("| 7. Reports                                  |");
         System.out.println("|                                             |");
         System.out.println("| 0. Exit                                     |");
         System.out.println("-----------------------------------------------");
         System.out.print("Enter choice[1-6,0] :");
         option = menuInput.nextInt(); 
         System.out.println(String.format("Option %d has been chosen", option));
         tmp = menuInput.nextLine();// clear the input buffer
      } // end while
      
      //To do: Handle the case where the user inputs an invalid choice 
      return option;   
       
   }
   
   public static void issueBook() {
   
   }
   
   public static void returnBook() {
      System.out.println("Option 'Return a book' has been selected");
      System.out.println("Not yet implemented");
   }
   
   public static void addUser() {
      System.out.println("Option 'Add a user' has been selected");
      System.out.println("Not yet implemented");
   }
   
   public static void addBook() {
      System.out.println("Option 'Add a book' has been selected");
      System.out.println("Not yet implemented");
   }
   
   public static int listBooksAndGetBookId(BookList catalogue) {
      Scanner menuInput = new Scanner(System.in);
      int bookId = 0; //means bookId is not defined
      
      String tmp;
      final int LIST_SIZE = 7;
      int i;
      int size = catalogue.BookList.size();
   
      for(i = 0; i < size; i = i+LIST_SIZE ) {
         int j = 0;
         //for(j = 0; j < LIST_SIZE; j++) {
         while(j < LIST_SIZE) {
             System.out.println(String.format("[%02d]---------------------------", i+j));
             try {
                System.out.println(catalogue.BookList.get( i+j));
             }catch (ArrayIndexOutOfBoundsException  e) {
                System.out.println(String.format( "Error: The ArrayList index was exceeded! i=%d, j =%d", i, j));
             }  
             j = j+1;
             if(j+i >= size)  // SRB: Should this be j > size rather than j+1 > size?
              break;
         }
        // }
         System.out.print(String.format("\n ......Press any key to continue :"));
         tmp = menuInput.nextLine();
         Scanner f1 = new Scanner(tmp);
         if (f1.hasNextInt()) {
             if(catalogue.validBookId(bookId = f1.nextInt())) 
                break;
             else {
                System.out.println(String.format("Error: [%d] is not a valid BookId", bookId));
                bookId = 0; //Reset bookId to not defined
             }
         }
         
      } //end for loop - i
      return bookId;
   
   }
   
   public static void listUsers(Userlist users) {
   
     Scanner input = new Scanner(System.in);
     int usersId = 0;
     
     String usl;
     final int USER_SIZE = 5;
     int i;
     int length = users.UserList.size();
     
     for(i = 0; i < USER_SIZE; i = i++) {
         int j = 0;
         while(j < USER_SIZE) {
            System.out.println(String.format("[%02d]------------------------", i+j));
            System.out.println(users.UserList.get(i+j));
           j = j+1;
           if(j >=length)
             break;
         }
         
         System.out.print(String.format("\n ......Press enter to continue :"));
         usl = input.nextLine();
         Scanner readr = new Scanner(usl);
         if(readr.hasNextInt()) {
           if(users.validUsersId(usersId = readr.nextInt()))
              break;
           else {
               System.out.println(String.format("Error: [%d] is not a valid User ID", usersId));
               usersId = 0; 
           }   
         }       
     }
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
