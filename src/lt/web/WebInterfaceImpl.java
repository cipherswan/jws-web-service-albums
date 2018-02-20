package lt.web;

import javax.jws.WebService;
import java.util.List;

@WebService(endpointInterface = "lt.web.WebInterfaceAlbum")
public class WebInterfaceImpl implements WebInterfaceAlbum {

    private AlbumList albumList = new AlbumList();

    @Override
    public void newAlbum(Album album) {
        System.out.println(album.getAlbumArtist() + " - " + album.getAlbumName() + " (" + album.getAlbumDate() + ")");
        System.out.println("---");
    }

    @Override
    public void getAll(List<Album> list) {

        albumList.setArray();

        for (Album albums : albumList.getAlbums()) {
            System.out.println(albums.getAlbumArtist() + " - " + albums.getAlbumName() + " (" + albums.getAlbumDate() + ")");
            System.out.println("---------");
        }
    }

    @Override
    public List<Album> sortAlbums() {

        albumList.testOld();
        System.out.println("Sorted list of albums: ");

        for (Album albums : albumList.getAlbums()) {
            System.out.println(albums.getAlbumArtist() + " - " + albums.getAlbumName() + " (" + albums.getAlbumDate() + ")");
        }
        return albumList.getAlbums();
    }

    @Override
    public void getAlbumByName(Album album) {

        for (Album albums : albumList.getAlbums()) {
                System.out.println("Artist name: " + albums.getAlbumArtist());
                System.out.println("Album name: " + albums.getAlbumName());
                System.out.println("Album date: " + albums.getAlbumDate());
                System.out.println("---------");
        }
    }

}



