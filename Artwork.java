public class Artwork {
    private String title;
    private int yearCreated;
    private Artist artist;

    // Default constructor
    public Artwork() {
        this.title = "unknown";
        this.yearCreated = -1;
        this.artist = new Artist(); //new Artist object
    }

    // Parameterized constructor
    public Artwork(String title, int yearCreated, Artist artist) {
        this.title = title;
        this.yearCreated = yearCreated;
        this.artist = artist;
    }

    // Get methods
    public String getTitle() {
        return title;
    }

    public int getYearCreated() {
        return yearCreated;
    }

    public Artist getArtist() { //get artist from Artist class
        return artist; 
    }

    // printInfo method
    public void printInfo() {
        artist.printInfo(); // calls printInfo from Artist

        if (yearCreated == -1){ //year created unknown
            System.out.println("Title: " + title + ", Year Created Unknown");
        }
        else{ //otherwise output year created
        System.out.println("Title: " + title + ", " + yearCreated);
        }
    }
}