
public class Movie extends Media {
 
    //instance variables
    private String director;
    private int runningTime;

    //constructor
    Movie(String title, MediaType mediaType, String genre, int id, String director, int runningTime) {
        super(title, mediaType, genre, id);
        this.director=director;
        this.runningTime=runningTime;
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