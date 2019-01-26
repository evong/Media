
public class Vinyl extends Media{
 
    //instance variables
    private String artist;
    private String vinylLength;

    //constructors
    Vinyl(String title, MediaType mediaType, String genre, int id, String artist, String vinylLength) {
        super(title, mediaType, genre, id);
        this.artist = artist;
        this.vinylLength = vinylLength;
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
 
    public void listen() {
        System.out.println("You listened to " + getTitle() + " by " + artist);
    }
}