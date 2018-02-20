package lt.web;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AlbumList {

    public List<Album> getAlbums() {
        return albums;
    }

    private List<Album> albums = new ArrayList<>();

    public void testOld(){
        albums.sort(Comparator.comparingInt(Album::getAlbumDate));
    }

    public void setArray(){

        Album tdsotm = new Album();
        tdsotm.setAlbumArtist("Pink Floyd");
        tdsotm.setAlbumName("The Dark Side of the Moon");
        tdsotm.setAlbumDate(1973);

        Album wish = new Album();
        wish.setAlbumArtist("Pink Floyd");
        wish.setAlbumName("Wish You Were Here");
        wish.setAlbumDate(1975);

        Album animals = new Album();
        animals.setAlbumArtist("Pink Floyd");
        animals.setAlbumName("Animals");
        animals.setAlbumDate(1977);

        Album seer = new Album();
        seer.setAlbumArtist("Swans");
        seer.setAlbumName("The Seer");
        seer.setAlbumDate(2012);

        Album tbk = new Album();
        tbk.setAlbumArtist("Swans");
        tbk.setAlbumName("To Be Kind");
        tbk.setAlbumDate(2014);

        albums.add(wish);
        albums.add(tdsotm);
        albums.add(animals);
        albums.add(tbk);
        albums.add(seer);

    }
}
