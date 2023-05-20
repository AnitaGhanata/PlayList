package listenify;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;



public class Album {
    public String albumName;
    public String artistName;
    public List<Song>songList;

    public Album(String albumName, String artistName) {
        this.albumName = albumName;
        this.artistName = artistName;
        this.songList = new ArrayList<>();


    }
    public boolean findSongInAlbum(String title){
        // Iterate over the arraylist and match
        // each Songs title with title
        for(Song song: songList){
            if(song.title.compareTo(title)==0){
                return true;
            }
        }
        return  false;
    }
    public String addSongToPlayList(String title, double duration){
        // check if the song is already present we will not add
        // otherwise we will create a new song and add it to album
        if(findSongInAlbum(title)==true){
            return "Song is already present";


        }
        else{
            // iI need tp create a Song Object and then add it to songList
            Song newSong = new Song(title,duration);
            songList.add(newSong);
            return "New Song has been added successfully";
        }
    }
    public String addSongToPlayList(int trackNo, LinkedList<Song>playList){
        //trackNo is a no. in the songList
        // trackNo : 1,2,3,4,5....
        // indices : 0,1,2,3,4....
        int index = trackNo -1;

        // checking for validity of index
        if(index>=0 && index<this.songList.size()){
            Song song = this.songList.get(index);
            playList.add(song);
            return "Song added to playList";

        }
        return "Invalid track No.";

    }
    public String addSongToPlayList(String title, LinkedList<Song>playList){
        //I need to find out that Song with that title
        // and put it in the playlist
        // iterate:
        boolean addedSong = false;
        for(Song song: songList){
            if (song.title == title) {

                playList.add(song);
                addedSong = true;
                return "Song has been added successfully";
            }
        }
        if(addedSong==false){
            return "Song doesnot exist";
        }
        return title;
    }



}
