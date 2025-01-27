package maa;

/**
 * File for a Song class to be used in the Playlist Project
 * @Audrey Ma @Brynn Connolly
 * @2024-01-27
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
    public Song(String songName, String songArtist, int songMinutes, int songSeconds, boolean )
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
     * Returns the length of the song
     * @return String song length
     */
    public String getLength()
    {
        return length;
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


