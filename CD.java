public class CD extends Media {

    //instance variables
    private String artist;
    private String albumLength;
    private int numTracks;
    private static final MediaType mediaType = MediaType.CD;
    private static final CDListener listen = new CDListener();

    //constructors
    CD(String title, String genre, int id) {
        super(title, mediaType, genre, id);
    }

    CD(String title, String genre, int id, String artist, String albumLength, int numTracks) {
        this(title, genre, id);
        this.artist=artist;
        this.albumLength=albumLength;
        this.numTracks=numTracks;
    }

    //getters and setters
    public String getArtist() {
        return artist;
    }
    public String getAlbumLength() {
        return albumLength;
    }
    public int getNumTracks() {
        return numTracks;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
    public void setAlbumLength(String albumLength) {
        this.albumLength = albumLength;
    }
    public void setNumTracks(int numTracks) {
        this.numTracks = numTracks;
    }

    @Override
    public String toString() {
        String t = super.toString();
        t += "\nArtist: " + artist;
        t += "\nAlbum Length: " + albumLength;
        t += "\nNumber of Tracks: " + numTracks;

        return t;
    }

    @Override
    public boolean equals(Object obj) {
        if(super.equals(obj)) {
            CD otherCD = (CD) obj;
            if(artist.equals(otherCD.artist)) {
                return true;
            }
        }
        return false;
    }

    public void listenTo() {
        listen.listen();
    }
}
