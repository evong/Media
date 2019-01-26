public enum MediaType {

    VINYL("1st floor"), MOVIE("1st floor"), LIBRARYBOOK("Floor 2");

    private String librarySection;

    private MediaType(String librarySection) {
        this.librarySection=librarySection;
    }

    public String getLibrarySection() {
        return librarySection;
    }

}