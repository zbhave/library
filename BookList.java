import java.util.ArrayList;

/**
 * Class that demonstrates inheritance through a hierarchy
 *
 *  of book types.
 */
public class BookList {
  // private static int uid = 0;
   /**
    * Creates several LibraryBook objects.
    *
    * @param args command line arguments, which are ignored.
    */
    
   public ArrayList <LibraryBook> BookList = new ArrayList<>();
   public void createBookList() {
   
      int i;
     
      for( i = 0; i < 1; i++){
   
          LibraryBook hemingway = new LibraryBook("Hemingway",
               "Green Hills of Africa", 234, 50.0, "Biography, Travel Literature");
                BookList.add(hemingway);
          LibraryBook clancy = new LibraryBook("Clancy",
               "The Hunt for Red October", 490, 39.0, "Novel, Thriller, Fiction");
                BookList.add(clancy);
          LibraryBook grisham = new LibraryBook("Grisham",
               "The Firm", 550, 28.0, "Novel, Mystery, Fiction"); 
                BookList.add(grisham);
          LibraryBook lee = new LibraryBook("Lee",
               "To Kill a Mockingbird", 281, 24.98, "Novel, Southern Gothic Fiction");
                BookList.add(lee);
          LibraryBook faulkner = new LibraryBook("Faulkner", 
               "The Sound and the Fury", 326, 42.00, "Novel, Modern Literature, Gothic Fiction");
                BookList.add(faulkner);
          LibraryBook tolkien = new LibraryBook("Tolkien",
               "The Lord of the Rings", 1178, 45.50, "Fantasy Fiction, Adventure Fiction, Heroic Fantasy");
               BookList.add(tolkien);
          LibraryBook herbert = new LibraryBook("Herbert", 
               "Dune", 412, 20.50, "Novel, Science Fiction, Adventure Fiction, Fantasy Fiction");
               BookList.add(herbert);
          LibraryBook homer = new LibraryBook("Homer", 
               "Iliad", 700, 22.00, "Epic Poetry, Poetry");
                BookList.add(homer);
          LibraryBook fitzgerald = new LibraryBook("Fitzgerald", 
               "The Great Gatsby", 208, 19.99, "Npvel, Fiction, Fantasy");
                BookList.add(fitzgerald);
          LibraryBook tolstoy = new LibraryBook("Tolstoy", 
                "War and Peace", 1225, 34.45, "Novel, Historic Novel, Historical Fiction, Romance");
                BookList.add(tolstoy);
      }                                                                    
      
            
           
   }
   
  
}
