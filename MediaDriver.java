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
    }
}