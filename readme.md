# Parent Class
* Media
   * \- String title, mediaType, genre
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
   * \- static final String MEDIA_TYPE = "vinyl"
   * \+ listen(): void

* LibraryBook
   * \- String author, isbn
   * \- int pageCount
   * \- static final String MEDIA_TYPE = "book"
   * \+ placeBookmark(): void
   * \+ readBook(): void

* Movie
   * \- String director, runningTime
   * \- static final String MEDIA_TYPE = "movie"
   * \+ watchMovie(): void

# Driver
* MediaDriver