 

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
    private int durationInSecs;
    private boolean liked;

    /**
     * Constructor-- what information needs to be given to make a Song?
     * How will you handle 'liked' songs? It makes sense for a Song not be 'liked' by default
     */
    public Song(String songName, String songArtist, int time, boolean liked)
    
        {name = songName;
        artist = songArtist; 
        durationInSecs = time;
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
    
    
    public int getDuration()
    {
        return durationInSecs;
    }
    public String getDurationMins()
    {
        return durationInSecs/60 + ":" + durationInSecs%60;
    }
    
    public boolean status()
    {
        return liked;
    }
    
    
    /**
     * Likes a song
     */
    public void likeSong(boolean status)
    {
        liked = status;
    }
    
    
}


