import java.util.Comparator;

public class LibraryBook extends Media implements Comparable<LibraryBook> {
 
    //instance variables
    private String author;
    private String isbn;
    private int pageCount;
    private static final MediaType mediaType = MediaType.LIBRARYBOOK;

    public final static Comparator<LibraryBook> LIBRARY_PAGE_COUNT_COMPARATOR = new LibraryBookPageCountComparator();

    //constructors
    LibraryBook(String title, String genre, int id, String author, String isbn, int pageCount) {
        this(title, genre, id);
        this.author = author;
        this.isbn = isbn;
        this.pageCount = pageCount;
    }

    LibraryBook(String title, String genre, int id) {
        super(title, mediaType, genre, id);
    }
 
    //getters and setters
    public int getPageCount() {
        return pageCount;
    }
    public String getIsbn() {
        return isbn;
    }
    public String getAuthor() {
        return author;
    }
 
    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
 
    @Override
    public String toString() {
        String t=super.toString();
        t += "\nAuthor: " + author;
        t += "\nPage Count: " + pageCount;
 
        return t;
    }
 
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof LibraryBook) {
            LibraryBook otherObject = (LibraryBook) obj;
            if(isbn.equals(otherObject.isbn)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int compareTo(LibraryBook pBook) {
        String thisCompareValue = author + super.getTitle();
        String othCompareValue = pBook.author + pBook.getTitle();

        return thisCompareValue.compareTo(othCompareValue);
    }

    private static class LibraryBookPageCountComparator implements Comparator<LibraryBook> {
        @Override
        public int compare(LibraryBook book1, LibraryBook book2) {
            return Integer.compare(book1.pageCount,book2.pageCount);
        }
    }

    public void placeBookmark() {
        System.out.println("You placed your bookmark on page x");
    }
 
    public void readBook() {
        System.out.println("You read " + getTitle());
    }
}
