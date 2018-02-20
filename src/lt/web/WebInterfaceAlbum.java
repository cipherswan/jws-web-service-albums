package lt.web;
import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public interface WebInterfaceAlbum {

    @WebMethod
    void newAlbum(Album album);

    @WebMethod
    void getAll(List<Album> list);

    @WebMethod
    List sortAlbums();

    @WebMethod
    void getAlbumByName(Album album);
}
