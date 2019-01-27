public class Media {
 
    private String title, genre;
    private MediaType mediaType;
    private int id;
    private static int mediaCount, checkedOutMedia; //M2 HOMEWORK STATIC
    private static final int MIN_ID = 999;
 
    //constructor
    Media(String title, MediaType mediaType, String genre, int id ) { //M2 HOMEWORK ENUM USE
        this.title=title;
        this.mediaType=mediaType;
        this.genre=genre;
        if(id > MIN_ID ) {
            this.id=id;
        }
        Media.mediaCount++; //M2HOMEWORK STATIC
    }
 
    //getters and setters
    public String getTitle() {
        return title;
    }
    public MediaType getMediaType() {
        return mediaType;
    }
    public String getGenre() {
        return genre;
    }
    public int getId() {
        return id;
    }
    //M2 HOMEWORK STATIC
    public static int getMediaCount(){
        return Media.mediaCount;
    }
    //M2 HOMEWORK STATIC
    public static int getCheckedOutMedia(){
        return Media.checkedOutMedia;
    }
 
    public void setTitle(String title) {
        this.title = title;
    }
    public void setMediaType(MediaType mediaType) {
        this.mediaType = mediaType;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public void setId(int id) {
        if(id>999) {
            this.id = id;
        }
    }
 
    @Override
    public String toString() {
        String t = "ID: " + id;
        t += "\nTitle: " + title;
        t += "\nType of Media: " + mediaType;
        t += "\nGenre " + genre;
 
        return t;
    }
 
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Media) {
            Media otherObject = (Media) obj;
 
            boolean isSameTitle = title.equals(otherObject.getTitle());
            boolean isSameMediaType = mediaType.equals(otherObject.getMediaType());
            
            if(isSameTitle && isSameMediaType) {
                return true;
            }
        }
        return false;
    }
 
    public void borrow() {
        Media.checkedOutMedia++; //M2HOMEWORK STATIC
        System.out.println("You checked out " + title);
    }
 
    public void turnIn() {
        Media.checkedOutMedia--; //M2HOMEWORK STATIC
        System.out.println("You returned " + title);
    }
 
    public void reviewMedia() {
        System.out.println("You left a review");
    }
}