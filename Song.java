 

/**
 * File for a Song class to be used in the Playlist Project
 * Project for AP Computer Science A
 * @author Audrey Ma and Brynn Connolly 
 * @versionn 2024-01-27
 */
public class Song 
{
    private String name;
    private String artist;
    private int minutes;
    private int seconds;
    private boolean liked;

    /**
     * Constructor-- what information needs to be given to make a Song?
     * How will you handle 'liked' songs? It makes sense for a Song not be 'liked' by default
     */
    public Song(String songName, String songArtist, int songMinutes, int songSeconds, boolean liked)
    {
        name = songName;
        artist = songArtist; 
        minutes = songMinutes;
        seconds = songSeconds;
        liked = false;
    }

    /**
     * Methods-- what will you want each Song to do?
     * Consider all the getter methods (getName, getArtist, etc.)
     * You should probably have a toString method to be able to get the information for the full
     * song easily as well!
     * What kind of mutator (setter) methods will you need?
     */
    
    /**
     * Identifies the name of the song
     * @return String name of song
     */
    public String getName()
    {
        return name;
    }

    /**
     * Identifies the artist of the song
     * @return String artist name
     */
    public String getArtist()
    {
        return artist;
    }
    
    /**
     * Identifies the total length of the song in a string form with a colon (X:YZ)
     * @return String song length
     */
    public String getLengthString()
    {
        return (minutes + ":" + seconds);
    }
    
    /**
     * Identifies the minutes of the song
     * @return int song minutes
     */
    public int getSongMinutes()
    {
        return minutes; 
    }
    
    /**
     * Identifies the seconds of the song
     * @return int song seconds
     */
    public int getSongSeconds()
    {
        return seconds;
    }
    
    /**
     * Identifies whether or not the song is liked or not
     * @return boolean liked
     */
    public boolean getLiked()
    {
        return liked;
    }
    
    /**
     * Likes a song
     */
    public void likeSong()
    {
        liked = true;
    }
    
    /**
     * Unlikes a song
     */
    public void unlikeSong()
    {
        liked = false;
    }
}


