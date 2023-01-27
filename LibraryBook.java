


public class LibraryBook extends Book{
    public enum Status {
       AVAILABLE,
       ISSUED,
       ON_HOLD
    }

    private Status bookStatus = Status.AVAILABLE;
    private int uid;  // user id of person issuing book ..
    
    
    public LibraryBook(String theAuthor, String theTitle, int thePages,
         Double thePrice, String theGenre) {
         super(theAuthor, theTitle, thePages, thePrice, theGenre);
    }
         
    public LibraryBook(){
    
    }
   
   
    
    public Status getBookStatus ( int bookUid ) {
        
        return Status.AVAILABLE; //(the equivalent of bookStatus); 
    }
    
    public void setBookStatus( Status bkStatus, int customerId ) {
        bookStatus = bkStatus;
        uid = customerId;

    }
    
    public String toString() {
    //return (Book.toString()+"\nStatus : "+ toString(this.bookStatus);
        return (super.toString()+ "\nStatus : " +  bookStatus + "\nUserId : "+ uid  );
    }
       
}
