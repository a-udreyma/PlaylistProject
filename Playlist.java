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
    public void like(String title)
    {
        for (Song song :  playlist)
        {
            if (song.getName().equals(title)) 
            { 
                song.status(); 
            }
        }
    }
    
    /**
     * Removes a song from the playlist
     * @param a the song to remove from the playlist
     */
    public void removeSong(String title)
    {
        for(int i = playlist.size()-1; i >= 0; i--)
        {
            if(playlist.get(i).getName().equals(title))
            {
                playlist.remove(i);
            }
        }
        
    }

    /**
     * Examines all the songs in the playlist
     */
    public void showAllSongs()
    {
        for (Song song : playlist)
        {
            System.out.println("\"" + song.getName() + "\" by " + song.getArtist() + " (" + song.getDuration() + ")");
        }
    }

    /**
     * Examines all liked songs in the playlist
     */
    public void showLikedSongs()
    {
        for (Song song : playlist)
        {
            if (song.status() == true)
            {
                System.out.println("\"" + song.getName() + "\" by " + song.getArtist() + " (" + song.getDuration() + ")");
            }
        }
    }

    /**
     * Returns the total duration of all the songs in the playlist
     * @return String the total duration of the playlist in hours, minutes, and seconds 
     */
    public String getTotalDuration()
    {
        int totaltime = 0;
        for( Song song : playlist)
        {
            totaltime += song.getDuration();
        }
        return (totaltime/60) + ":" + (totaltime%60);
    }

    /**
     * Removes unliked songs from the playlist
     */
    public void removeUnlikedSongs()
    {
        for(int i = playlist.size()-1; i >= 0; i--)
        {
            if(!playlist.get(i).status())
            {
                playlist.remove(i);
            }
        }
    }
}
