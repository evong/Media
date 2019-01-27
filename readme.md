# Parent Class
* Media
   * \- String title, genre
   * \- private MediaType mediaType
   * \- int id
   * \- static int mediaCount, checkedOutMedia
   * \- static final int MIN_ID = 999
   * \+ toString(): String
   * \+ equals(Object obj): boolean
   * \+ borrow(): void
   * \+ turnIn(): void
   * \+ reviewMedia(): void

# Child Class

* Vinyl
   * \- String artist, vinylLength
   * \+ listen(): void

* LibraryBook implements Comparable
   * \- String author, isbn
   * \- int pageCount
   * \+ placeBookmark(): void
   * \+ readBook(): void
   * \+ compareTo(LibraryBook pBook): int

* Movie
   * \- String director, runningTime
   * \+ watchMovie(): void

# Enum class
* MediaType
   * VINYL ("1F", "music")
   * MOVIE ("1F", "movies")
   * LIBRARYBOOK ("2F", "books")
   * \- String librarySection, typeOfMedia
   * \+ private MediaType(String librarySection)
   * \+ getLibrarySection(): String
   * \+ locate(): void

# Driver
* MediaDriver   - driver for hw1
* CompareTester - driver for hw2
    * \+ private static padRight(String s, int n): String
