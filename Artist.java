public class Artist {
    private String name;
    private int birthYear;
    private int deathYear;

    // Default constructor
    public Artist() {
        this.name = "unknown";
        this.birthYear = -1;
        this.deathYear = -1;
    }

    // Parameterized constructor
    public Artist(String name, int birthYear, int deathYear) {
        this.name = name;
        this.birthYear = birthYear;
        this.deathYear = deathYear;
    }

    // Get methods
    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getDeathYear() {
        return deathYear;
    }

    // printInfo method
    public void printInfo() {
        System.out.print("Artist: " + name);

        if (birthYear >= 0 && deathYear >= 0) { //birth & death years known
            System.out.println(" (" + birthYear + " to " + deathYear + ")");
        } 
        else if (birthYear >= 0 && deathYear < 0) { //artist still alive
            System.out.println(" (" + birthYear + " to present)");
        } 
        else { //birth & death years unknown
            System.out.println(" (unknown)");
        }
    }
}