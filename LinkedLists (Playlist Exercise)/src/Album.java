import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    // Create an Album class which contains a list of songs.
    // The actual albums will be stored in an ArrayList

    private String title;
    private String artist;
    private ArrayList<Song> album;

    public Album(String title, String artist) {
        this.title = title;
        this.artist = artist;
        this.album = new ArrayList<Song>();
    }


    /**
     * Adds a song to the album, if the song doesn't already exist.
     * @param title
     * @param duration
     * @return
     */
    public boolean addSongToAlbum(String title, double duration) {
        if (findSong(title) == null) {
            this.album.add(new Song(title, duration));
            return true;
        }
        return false;
    }


    /**
     * Looks through an album and tries to match a given title, with the song titles in the album. Returns Song if found, null if not.
     * @param title
     * @return
     */
    private Song findSong(String title) { // private because we don't want to give users access to this method.

        for (Song s : album) {
            if (s.getTitle() == title) {
                return s;
            }
        }
        return null;
    }


    public boolean addSongToPlaylist(String title, LinkedList<Song> playlist) {

        for (Song s : album) {
            if (s.getTitle() == title) {
                playlist.add(s);
                return true;
            }
        }
        System.out.println("Could not find " + title + " in an album");
        return false;
    }
}
