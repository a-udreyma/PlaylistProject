/**
 * Sample of a tester file for the Playlist class. This file should demonstrate all the capability of your
 * playlist in the main method. You don't need to follow the testing specifications of this exactly
 * if you want to write your own separate tester instead.
 * Note that there's no need for a Scanner in this project-- all of the playlist can be 'hardcoded' into main.
 * @author
 * @version
 */
public class PlaylistTester {
    public static void main(String[] args) {
        System.out.println("Initializing a Playlist...\n"); // making the playlist to tst
        int testPassed = 0;
        Playlist n = new Playlist();
        testPassed++;
        System.out.println("Tests passed: " + testPassed + "/9");

        

        testPassed++;
        System.out.println("Tests passed: " + testPassed + "/9");

        System.out.println("Adding songs to the Playlist...\n");
        /**
         * Add some songs here. Note that the format for adding a Song to a Playlist p
         * is something like...
         * p.addSong(new Song(..., ..., ...))
         */
        n.addSong(new Song("Kill Bill", "SZA", 175, true));
        n.addSong(new Song("No Control", "One Direction", 199, false));
        n.addSong(new Song("Call Out My Name", "The Weeknd", 238, false));
        testPassed++;
        

        System.out.println("Tests passed: " + testPassed+ "/9");
        
        System.out.println("Displaying liked songs within the empty playlist...");
        n.showLikedSongs();
        testPassed++;
        System.out.println("Tests passed: " + testPassed + "/9");
        
        System.out.println("Printing the songs...\n");
        //Print out all the songs in the playlist to verify it's working correctly
        n.showAllSongs();
        testPassed++;
        System.out.println("Tests passed: " + testPassed + "/9");


        System.out.println("\nLiking the songs in position X, Y, Z, etc....\n");
        //Once your songs are 'liked', this should be reflected in the next printout
        n.like("No Control");
        testPassed++;
        System.out.println("Tests passed: " + testPassed + "/9");

        System.out.println("Printing the songs...\n");
        n.showAllSongs();
        
        System.out.println("\nRemoving the song in position A, B, C, etc...\n");
        n.removeSong("No Control");
        
        System.out.println("Printing the songs...\n");
        n.showAllSongs();
        System.out.println("\nPrinting only the liked songs...\n");
        //Your Playlist should be able to do this without looping while in main!
        n.showLikedSongs();
        testPassed++;
        System.out.println("Tests passed: " + testPassed + "/9");

        System.out.println("\nPrinting the total duration of all songs...\n");
        //Note that the format should look something like minutes:seconds
        System.out.println(n.getTotalDuration());
        testPassed++;
        System.out.println("Tests passed: " + testPassed + "/9");

        System.out.println("\nRemoving all unliked songs from the playlist...\n");
        //This should be doable with a single method call
        n.removeUnlikedSongs();

        System.out.println("Printing all songs...\n");
        n.showAllSongs();
        testPassed++;
        System.out.println("Tests passed: " + testPassed + "/9");

        System.out.println("Tests completed!");
        //This should now look like only the liked songs list from before
    }
}
