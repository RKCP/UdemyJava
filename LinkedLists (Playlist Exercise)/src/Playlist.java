import java.util.*;

public class Playlist {

    // Create a program that implements a playlist for songs
    // Songs from different albums can be added to the playlist.
    // The playlist is a linked list.
    // Songs that we add will appear in the list in the order they were added.
    // Once songs have been added to the playlist, you want to create a menu of options to add the below functionality:
    //  - Quit out of the menu
    //  - Skip forward to the next song
    //  - Skip backwards to a previous song
    //  - Replay the current song (consider what happens when you go back and forth without tracking the direction)
    //  - List the songs in the playlist
    //  - Remove the current song from the playlist. (hint: ListIterator.remove()

    // A song MUST exist in the album, before it can be added to the playlist.


    private LinkedList<Song> playlist;

    public Playlist() {
        this.playlist = new LinkedList<Song>();
    }


}
