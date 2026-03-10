package java.practice.film;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FilmLibrary implements IFilmLibrary {
    private List<IFilm> films=new ArrayList<>();

    @Override
    public void addFilm(IFilm film) {
    films.add(film);
    }

    @Override
    public void removeFilm(String title) {
//        Iterator<IFilm> iterator = films.iterator();
//        while(iterator.hasNext()){
//            IFilm film = iterator.next();
//            if(film.getTitle().equals(title)){
//                iterator.remove();
//                break;
//            }
//        }
        films.removeIf(film -> film.getTitle().equalsIgnoreCase(title));

    }

    @Override
    public java.util.List<IFilm> getAllFilms() {
        return films;
    }

    @Override
    public java.util.List<IFilm> searchFilms(String query) {
        return null;
    }

    @Override
    public int getTotalFilmCount() {
        return 0;
    }

}
