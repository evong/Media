# Parent Class
* Media
   * \- String title, mediaType, genre
   * \- int id
   * \- static final int MIN_ID = 999
   * \+ toString(): String
   * \+ equals(Object obj): boolean
   * \+ borrow(): void
   * \+ turnIn(): void
   * \+ reviewMedia(): void

# Child Class

* Vinyl
   * \- String artist, vinylLength
   * \- static final String MEDIA_TYPE = "vinyl"
   * \+ listen(): void

* LibraryBook implements Comparable
   * \- String author, isbn
   * \- int pageCount
   * \- static final String MEDIA_TYPE = "book"
   * \+ placeBookmark(): void
   * \+ readBook(): void
   * \+ compareTo(LibraryBook pBook): int

* Movie
   * \- String director, runningTime
   * \- static final String MEDIA_TYPE = "movie"
   * \+ watchMovie(): void

# Tester
* BookTester - test comparTo development

# Driver
* MediaDriver   - driver for hw1
* CompareTester - driver for hw2
    * \+ private static padRight(String s, int n): String
