
public class Vinyl extends Media{
 
    //instance variables
    private String artist;
    private String vinylLength;
    private static final MediaType mediaType = MediaType.VINYL;
    private static final VinylListener listen = new VinylListener();

    //constructors
    Vinyl(String title, String genre, int id, String artist, String vinylLength) {
        this(title, genre, id);
        this.artist = artist;
        this.vinylLength = vinylLength;
    }

    Vinyl(String title, String genre, int id) {
        super(title, mediaType, genre, id);
    }
 
    //getters and setters
    public String getArtist() {
        return artist;
    }
    public String getVinylLength() {
        return vinylLength;
    }
 
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public void setVinylLength(String vinylLength) {
        this.vinylLength = vinylLength;
    }
 
    @Override
    public String toString() {
        String t = super.toString();
        t += "\nArtist: " + artist;
        t += "\nRecord Length: " + vinylLength;
 
        return t;
    }
 
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Vinyl) {
            Vinyl otherObject = (Vinyl) obj;
            boolean isSameArtist = artist.equals(otherObject.artist);
            boolean isSameTitle = getTitle().equals(otherObject.getTitle());
 
            if(isSameArtist && isSameTitle) {
                return true;
            }
        }
        return false;
    }
 
    public void listenTo() {
        System.out.println("Preparing " + getTitle() + " by " + artist);
        listen.listen();
    }
}