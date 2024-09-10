import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        //Output initial messages before taking input
        System.out.println("Please enter information for the following fields:");
        System.out.println("(Artist Name, Birth Year, Death Year, Artwork Title, Artwork Year Created)\n");
        System.out.println("After entering information for one field, hit \"Enter\" to go to next field.");
        System.out.println("For Birth Year or Artwork Year Created unknown, type \"-1\". ");
        System.out.println("If artist is still alive, type \"-1\" for Death Year.");
        //end of initial output msgs

        // Read input
        String artistName = scnr.nextLine();
        int birthYear = scnr.nextInt();
        int deathYear = scnr.nextInt();
        scnr.nextLine(); // Consume the newline character
        String artworkTitle = scnr.nextLine();
        int yearCreated = scnr.nextInt();
        scnr.close(); //close after done with scanner (prevent memory leak)

        // Create Artist and Artwork objects
        Artist artist = new Artist(artistName, birthYear, deathYear);
        Artwork artwork = new Artwork(artworkTitle, yearCreated, artist);

        // Display the information
        System.out.println(); //print empty line for spacing
        artwork.printInfo();
    }
}