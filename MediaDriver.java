import java.util.ArrayList;
 
public class MediaDriver {

    public static void main(String[] args) {

        ArrayList<Media> mediaList = new ArrayList<Media>();
        mediaList.add(new Vinyl("Thriller", MediaType.VINYL, "Pop", 3000, "Michael Jackson", "42:19"));
        mediaList.add(new Vinyl("Back in Black", MediaType.VINYL, "Rock", 3001, "AC/DC", "42:11"));
        mediaList.add(new LibraryBook("Catch 22", MediaType.LIBRARYBOOK,"Black Comedy", 1000, "Joseph Heller", "0-684-83339-5", 453));
        mediaList.add(new LibraryBook("Harry Potter and the Philosopher's Stone", MediaType.LIBRARYBOOK,"Fantasy", 1001, "J. K. Rowling", "0-7475-3269-9",223));
        mediaList.add(new Movie("The Godfather", MediaType.MOVIE, "Crime/Drama", 2000, "Francis Ford Coppola", 177));
        mediaList.add(new Movie("The Avengers", MediaType.MOVIE, "Superhero", 2001, "Joss Whedon", 143));

        for(Media i : mediaList) {
            i.borrow();
            if(i instanceof Vinyl) {
                ((Vinyl) i ).listen();
            }
        }

        System.out.println("-------------------------Testing Static Methods--------------------------------------------");
        System.out.println("There are currently " + Media.getMediaCount() + " items available in the library.");
        System.out.println(Media.getCheckedOutMedia() + " of the items are currently checked out.");
        mediaList.get(0).turnIn();
        System.out.println("There are now " + Media.getCheckedOutMedia() + " items currently checked out.");

        System.out.println("-------------------------Testing Enum Methods--------------------------------------------");
        System.out.println("Books are found on the 2nd floor.");
        MediaType.LIBRARYBOOK.locate();
        System.out.println("Movies are found on the 1st floor.");
        MediaType.MOVIE.locate();
        System.out.println("Music can be found on the 1st floor.");
        MediaType.VINYL.locate();
        
        System.out.println("-------------------------Testing Comparables--------------------------------------------");
        int compareResult;
        ArrayList<LibraryBook> bookList = new ArrayList<LibraryBook>();
        //position 0
        bookList.add(new LibraryBook("Catch 22", MediaType.LIBRARYBOOK, "Black Comedy", 1000, "Joseph Heller", "0-684-83339-5", 453));
        bookList.add(new LibraryBook("Harry Potter and the Philosopher's Stone", MediaType.LIBRARYBOOK, "Fantasy", 1001, "J. K. Rowling", "0-7475-3269-9",223));
        bookList.add(new LibraryBook("Harry Potter new Chapter", MediaType.LIBRARYBOOK, "Fantasy", 1001, "J. K. Rowling", "0-7475-1234-1",223));
        bookList.add(new LibraryBook("Wow in the World", MediaType.LIBRARYBOOK, "Science", 1100, "Anne Doe", "0-7475-1221-1", 121));
        bookList.add(new LibraryBook("Fear", MediaType.LIBRARYBOOK, "Political", 1200, "Bob Woodward", "1-5011-7551-3", 121));
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