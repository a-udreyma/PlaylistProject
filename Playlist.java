import java.util.ArrayList;

/**
 * The Playlist class, which will keep track of a playlist of Song objects
 * Refer to the project description to make sure you have access to all available methods
 * Project for AP Computer Science A
 * @author Audrey Ma 
 * @version 2024-01-28
 */
public class Playlist 
{
    /**
     * Fields-- This will likely just need to be the ArrayList of Songs. Reference our previous problems
     * (CarDealership, Zoo) for structure on how this will look
     */
    private ArrayList<Song> playlist;

    /**
     * Constructor-- this doesn't need any parameters. You should just initialize the ArrayList and
     * then use additional methods to add Songs in one-by-one
     */
    public Playlist()
    {
        playlist = new ArrayList <Song>();
    }

    /**
     * Methods-- Remember that you need to be able to complete all of the following:
     * Adding a song
     * 'liking' a song
     * Removing a specific song
     * Examining all Songs (a String return or void print makes sense here)
     * Examining a sublist of all liked songs
     * Determining the total duration of all songs
     * Removing all unliked songs from the playlist (careful with this one!)
     */

    /**
     * Adds a song to this playlist
     * @param a the song to add to the playlist
     */
    public void addSong(Song newSong)
    {
        playlist.add(newSong);
    }

    /**
     * Likes a song in the playlist
     * @param a the song to like in the playlist
     */
    public void likeSong(Song newSong)
    {
        for (int i = 0; i < playlist.size(); i++)
        {
            if (playlist.get(i).equals(newSong)) 
            { 
                playlist.remove(i); 
            }
        }
    }
    
    /**
     * Removes a song from the playlist
     * @param a the song to remove from the playlist
     */
    public void removeSong(Song newSong)
    {
        playlist.remove(newSong);
    }

    /**
     * Examines all the songs in the playlist
     */
    public void showAllSongs()
    {
        for (Song song : playlist)
        {
            System.out.println("\"" + song.getName() + "\" by " + song.getArtist() + " (" + song.getLengthString() + ")");
        }
    }

    /**
     * Examines all liked songs in the playlist
     */
    public void showLikedSongs()
    {
        for (Song song : playlist)
        {
            if (song.getLiked() == true)
            {
                System.out.println("\"" + song.getName() + "\" by " + song.getArtist() + " (" + song.getLengthString() + ")");
            }
        }
    }

    /**
     * Returns the total duration of all the songs in the playlist
     * @return String the total duration of the playlist in hours, minutes, and seconds 
     */
    public String getTotalDuration()
    {
        int totalHours = 0;
        int totalMinutes = 0;
        int totalSeconds = 0; 
        for (Song song : playlist)
        {
            totalMinutes += song.getSongMinutes();
            totalSeconds += song.getSongSeconds();
        }

        if (totalSeconds >= 60)
        {
            totalMinutes += totalSeconds % 60;
            totalSeconds -= (totalSeconds % 60) * 60;
        }
        else if (totalMinutes >= 60)
        {
            totalHours += totalMinutes % 60; 
        }

        return ("In total, your playlist is " + totalHours + " hours, " + totalMinutes + " minutes, and " + totalSeconds 
            + " seconds long.");
    }

    /**
     * Removes unliked songs from the playlist
     */
    public void removeUnlikedSongs()
    {
        for (Song song : playlist)
        {
            if (song.getLiked() == false)
            {
                playlist.remove(song);
            }
        }
    }
}
