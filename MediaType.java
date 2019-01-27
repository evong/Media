public enum MediaType {

    VINYL("1F", "music"), MOVIE("1F", "movies"), LIBRARYBOOK("2F", "books");

    private String librarySection;
    private String typeOfMedia;

    private MediaType(String librarySection, String typeOfMedia) {
        this.librarySection=librarySection;
        this.typeOfMedia=typeOfMedia;
    }

    public String getLibrarySection() {
        return librarySection;
    }

    public void locate() {
        System.out.println("You can find " + typeOfMedia + " on " + librarySection);
    }

}