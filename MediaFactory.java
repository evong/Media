public class MediaFactory {

    public static Media newMedia(String title, MediaType type, String genre, int id) {
        Media media;

        if(type.equals(MediaType.LIBRARYBOOK)) {
            media = new LibraryBook(title, genre, id);
        } else if (type.equals(MediaType.MOVIE)) {
            media = new Movie.MovieBuilder(title, genre, id).build();
        } else if(type.equals(MediaType.VINYL)) {
            media = new Vinyl(title, genre, id);
        } else if (type.equals(MediaType.CD)) {
            media = new CD(title, genre, id);
        } else {
            throw new IllegalArgumentException();
        }

        return media;
    }
}
