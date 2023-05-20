package listenify;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static List<Album> albums = new ArrayList<>();
    public static void main(String[] args) {
        Album album= new Album("Old Hindi Song", "Arijit Singh");
        album.addSongToAlbum("Pathaan", 4.5);
        album.addSongToAlbum("Channa mereya",3.5);

        album.addSongToAlbum("");

        albums.add(album);

        album =  new Album();
        album.addSongToAlbum("");
        album.addSongToAlbum("");
        album.addSongToAlbum("");\

        //how many songs will this album variable have?

        albums.add(album);




    }
}