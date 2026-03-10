package java.practice.film;

import java.util.List;

public interface IFilmLibrary {
    void addFilm(IFilm film);
    void removeFilm(String title);

  List<IFilm> getAllFilms();
  List<IFilm>searchFilms(String query);
  int getTotalFilmCount();
}
