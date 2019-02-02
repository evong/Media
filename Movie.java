
public class Movie extends Media {
 
    //instance variables
    private String director;
    private int runningTime;
    private static final MediaType MEDIA_TYPE = MediaType.MOVIE;

    //constructor
    private Movie(MovieBuilder builder) { // M3 USING BUILDER
        setTitle(builder.title);
        setGenre(builder.genre);
        setMediaType(MEDIA_TYPE);
        setId(builder.id);
        this.director=builder.director;
        this.runningTime=builder.runningTime;
    }

    public static class MovieBuilder{
        private String title, genre;
        private int id;
        private String director = "";
        private int runningTime = 0;
        private static final int MIN_ID = 999;

        public MovieBuilder(String title, String genre, int id) {
            this.title=title;
            this.genre=genre;
            this.id=id;
        }
        public MovieBuilder director(String director) {
            this.director=director;
            return this;
        }
        public MovieBuilder runningTime(int runningTime) {
            this.runningTime=runningTime;
            return this;
        }
        public Movie build() {
            if(id<MIN_ID) {
                throw new IllegalArgumentException();
            }
            return new Movie(this);
        }
    }
 
    //getters and setters
    public String getDirector() {
        return director;
    }
    public int getRunningTime() {
        return runningTime;
    }
 
    public void setDirector(String director) {
        this.director=director;
    }
    public void setRunningTime(int lengthMinutes) {
        this.runningTime=lengthMinutes;
    }
 
    @Override
    public String toString() {
        String t=super.toString();
        t+="\nDirector: " + director;
        t+="\nRunning Time: " + runningTime;
 
        return t;
    }
 
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Movie) {
            Movie otherObject = (Movie) obj;
            Boolean isSameTitle = getTitle().equals(otherObject.getTitle());
            Boolean isSameDirector = director.equals(otherObject.director);
            if(isSameTitle && isSameDirector) {
                return true;
            }
        }
        return false;
    }
 
    public void watchMovie() {
        System.out.println("You watched the movie");
    }
}