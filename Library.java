
public class Library {
    public String libraryName;
    public Book book1;
    public Book book2;
    public Book book3;
    public void addBook(Book book, int slot){
        if (slot == 1) {
            book1 = book;
        }else if (slot == 2){
            book2 = book;
        }else if (slot == 3){
            book3 = book;
        }
        
    }
    public void removeBook(int slot){
        if (slot == 1) {
            book1 = null;
        }else if (slot == 2){
            book2 = null;
        }else if (slot == 3){
            book3 = null;
        }
    }
    public void printLibraryDetails(){
        System.out.println("LibraryName : " + libraryName);
        System.out.println();
        System.out.println("Title : " + book1 );
        System.out.println("Author : " + book1);
        System.out.println("Publisher : " + book1);
        System.out.println("Year Publsihed : " + book1);
        System.out.println("Price : $ " + book1);
        if (book1.isAvailable == true){
            System.out.println("Available : Yes");
        }else {
            System.out.println("Available : NO");
        }
        System.out.println();
        System.out.println("Title : " + book2 );
        System.out.println("Author : " + book2);
        System.out.println("Publisher : " + book2);
        System.out.println("Year Publsihed : " + book2);
        System.out.println("Price : $ " + book2);
        if (book2.isAvailable){
            System.out.println("Available : Yes");
        }else {
            System.out.println("Available : NO");
        }
        System.out.println();
        System.out.println("Title : " + book3 );
        System.out.println("Author : " + book3);
        System.out.println("Publisher : " + book3);
        System.out.println("Year Publsihed : " + book3);
        System.out.println("Price : $ " + book3);
        if (book3.isAvailable == true){
            System.out.println("Available : Yes");
        }else {
            System.out.println("Available : NO");
        }
    }
    public void checkBookAvailability(int slot){
        if (slot == 1){
            if(book1 == null){
                System.out.println("Book in slot "+ slot + " is not available.");
            }else {
                System.out.println("Book in slot "+ slot + " is not available.");
            }
        }else if (slot == 2){
            if(book2 == null){
                System.out.println("Book in slot "+ slot + " is not available.");
            }else {
                System.out.println("Book in slot "+ slot + " is not available.");
            }
        }else if (slot == 3){
            if(book3 == null){
                System.out.println("Book in slot "+ slot + " is not available.");
            }else {
                System.out.println("Book in slot "+ slot + " is not available.");
            }
        }
    }
    public void updateBookPrice(int slot, double newPrice){
        if (slot == 1){
            if (book1 != null){
                book1 = book;
                System.out.println("Updated price of " + book1.title + " to $ "+ newPrice + "." );
            }else {
                System.out.println("No book in this slot.");
            }
        }else if (slot == 2){
            if (book1 != null){
                System.out.println("Updated price of " + book2.title + " to $ "+ newPrice + "." );
            }else {
                System.out.println("No book in this slot.");
            }
        }else if (slot == 3){
            if (book1 != null){
                System.out.println("Updated price of " + book3.title + " to $ "+ newPrice + "." );
            }else {
                System.out.println("No book in this slot.");
            }
        }
    }
    public void printBookDetails(Book book){
        if (book != null){
            System.out.println("Title : " + book.title );
            System.out.println("Author : " + book.author);
            System.out.println("Publisher : " + book.publisher);
            System.out.println("Year Publsihed : " + book.yearPublished);
            System.out.println("Price : $ " + book.price);
            if (book.isAvailable == true){
                System.out.print("Available : Yes");
            }else {
                System.out.println("Available : NO");
            }
        }else {
            System.out.print("No book in this slot.");
        }
    }
}
