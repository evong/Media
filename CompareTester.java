import java.util.*;

 
public class CompareTester {
    // Padding values code identified at:
    // https://stackoverflow.com/questions/388461/how-can-i-pad-a-string-in-java
    private static String padRight (String s, int n) {
        return String.format("%-" + n + "s", s);
    }
    public static void main(String[] args) {

        ArrayList<LibraryBook> bookList = new ArrayList<LibraryBook>();
        //position 0
        bookList.add(new LibraryBook("Catch 22", "Black Comedy", 1000, "Joseph Heller", "0-684-83339-5", 453));
        bookList.add(new LibraryBook("Harry Potter new Chapter", "Fantasy", 1001, "J. K. Rowling", "0-7475-1234-1",223));
        bookList.add(new LibraryBook("Harry Potter and the Philosopher's Stone", "Fantasy", 1001, "J. K. Rowling", "0-7475-3269-9",223));
        bookList.add(new LibraryBook("Wow in the World", "Science", 1100, "Anne Doe", "0-7475-1221-1", 121));
        bookList.add(new LibraryBook("Fear", "Political", 1200, "Bob Woodward", "1-5011-7551-3", 121));
        //position 5
        int lCounter = 1;

        System.out.println("\n-------------------------Testing ArrayList sorting--------------------------------------------");
        System.out.println("Original List:");
        for (LibraryBook aBook : bookList) {
            System.out.print(padRight("Book " + lCounter, 10));
            System.out.println(padRight("Author: " + aBook.getAuthor(), 25) + 
            "Title: " + aBook.getTitle());        
            lCounter++;
        }  
        
        System.out.println("\nLets sort list by Author and Title.\n");
        Collections.sort(bookList);

        lCounter = 1;
        System.out.println("\nSorted List:");
        for (LibraryBook aBook : bookList) {
            System.out.print(padRight("Book " + lCounter, 10));
            System.out.println(padRight("Author: " + aBook.getAuthor(), 25) + 
                               "Title: " + aBook.getTitle());        
            lCounter++;
        }  

        System.out.println("\n-------------------------Testing Enum Methods--------------------------------------------");
        System.out.println("Books are found on the 2nd floor.");
        MediaType.LIBRARYBOOK.locate();
        System.out.println("Movies are found on the 1st floor.");
        MediaType.MOVIE.locate();
        System.out.println("Music can be found on the 1st floor.");
        MediaType.VINYL.locate();

        System.out.println("\n-------------------------Testing Static Methods--------------------------------------------");
        System.out.println("There are currently " + Media.getMediaCount() + " items available in the library.");
        System.out.println(Media.getCheckedOutMedia() + " of the items are currently checked out.\n");
        
        System.out.println("Checking out same two books.");
        bookList.get(0).borrow();
        bookList.get(0).borrow();
        System.out.println(Media.getCheckedOutMedia() + " of the items are currently checked out.\n");
        
        System.out.println("Returning one book not checked out.");
        bookList.get(3).turnIn();
        System.out.println("There are now " + Media.getCheckedOutMedia() + " items currently checked out.\n");
        
        System.out.println("Returning checked out book.");
        bookList.get(0).turnIn();
        System.out.println("There are now " + Media.getCheckedOutMedia() + " items currently checked out.\n");

        System.out.println("\n-------------------------Testing Builder Method-------------------------"); // M3 USING BUILDER
        Movie movie = new Movie.MovieBuilder("Scarface", "Thriller",1000)
                .director("Brian De Palma")
                .runningTime(170)
                .build();
        System.out.println(movie);
        // Uncomment to test invalid id
        // Movie movie2 = new Movie.MovieBuilder("Movietitle", "Genre", 1).build();

        System.out.println("\n-------------------------Testing Factory Method-------------------------"); // M3 USING FACTORY
        Media newLibrary = new Media();
        newLibrary.addMedia("book", MediaType.LIBRARYBOOK, "mystery", 1000);
        newLibrary.addMedia("movie", MediaType.MOVIE,"thriller", 2001);
        newLibrary.addMedia("vinyl", MediaType.VINYL, "pop", 3000);
        newLibrary.addMedia("cd", MediaType.CD, "classical", 4000);

        ArrayList<Media> listHolder = newLibrary.getMediaList();
        for(int i=0;i<listHolder.size();i++) {
            System.out.println(listHolder.get(i));
        }

        System.out.println("\n-------------------------Testing Strategy Pattern-------------------------"); // M3 USING STRATEGY
        for(int i=0;i<listHolder.size();i++) {
            if(listHolder.get(i) instanceof Vinyl) {
                ((Vinyl) listHolder.get(i)).listenTo();
            }
            if(listHolder.get(i) instanceof CD) {
                ((CD) listHolder.get(i)).listenTo();
            }
        }
    }
}

