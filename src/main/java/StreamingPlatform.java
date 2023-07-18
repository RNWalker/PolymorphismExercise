import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamingPlatform {

    private ArrayList<Film> films;
    private String name;

    public StreamingPlatform() {
        this.films = new ArrayList<>();
    this.name = name;}

    public void addNewFilm(Film film){ this.films.add(film);}

    public int countFilms(){
        return this.films.size();
    }

    public void loveFilm(){
        for (Film film : this.films){
            film.addToFavourites();
        }
    }


}
