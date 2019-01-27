import java.util.ArrayList;
 
public class BookTester {

    public static void main(String[] args) {
        int compareResult;
        ArrayList<LibraryBook> bookList = new ArrayList<LibraryBook>();
        //position 0
        bookList.add(new LibraryBook("Catch 22", "Black Comedy", 1000, "Joseph Heller", "0-684-83339-5", 453));
        bookList.add(new LibraryBook("Harry Potter and the Philosopher's Stone","Fantasy", 1001, "J. K. Rowling", "0-7475-3269-9",223));
        bookList.add(new LibraryBook("Harry Potter new Chapter","Fantasy", 1001, "J. K. Rowling", "0-7475-1234-1",223));
        bookList.add(new LibraryBook("Wow in the World","Science", 1100, "Anne Doe", "0-7475-1221-1", 121));
        bookList.add(new LibraryBook("Fear","Political", 1200, "Bob Woodward", "1-5011-7551-3", 121));
        //position 5
        
        LibraryBook thisBook = bookList.get(3);
        LibraryBook othBook = bookList.get(4);
        
        System.out.println("Testing Library Compare to Method\n");
        System.out.println("Book 1: " + thisBook.getTitle() + " by: " + thisBook.getAuthor());        
        System.out.println("\nvs\n");        
        System.out.println("Book 2: " + othBook.getTitle() + " by: " + othBook.getAuthor());        
        compareResult = thisBook.compareTo(othBook);
        System.out.println(compareResult);
    }
}