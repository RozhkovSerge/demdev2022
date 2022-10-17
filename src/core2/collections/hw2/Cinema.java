package core2.collections.hw2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Cinema {

    private Map<Integer, List<Film>> filmsBank = new LinkedHashMap<>();

    public void addFilm(Film filmToAdd) {
        if (!filmsBank.containsKey(filmToAdd.getProductionYear())) {
            List<Film> yearRecord = new ArrayList<>();
            yearRecord.add(filmToAdd);
            filmsBank.put(filmToAdd.getProductionYear(), yearRecord);
        } else {
            List<Film> yearRecord = filmsBank.get(filmToAdd.getProductionYear());
            if (!yearRecord.contains(filmToAdd)) {
                yearRecord.add(filmToAdd);
            }
        }
    }

    public List<Film> getFilmsByProductionYear(int year) {
        return filmsBank.get(year);
    }

    public List<Film> getFilmsByProductionYearAndMonth(int year, int month) {
        List<Film> filmsByYear = filmsBank.get(year);
        List<Film> result = new ArrayList<>();
        for (Film film : filmsByYear) {
            if (film.getProductionMonth() == month) {
                result.add(film);
            }
        }
        return result;
    }

    public List<Film> getFilmsByGenre(String genre) {
        List<Film> result = new ArrayList<>();
        for (List<Film> films : filmsBank.values()) {
            for (Film film : films) {
                if (film.getGenre().equals(genre)) {
                    result.add(film);
                }
            }
        }
        return result;
    }

    public List<Film> getTopTenSortedRate() {
        List<Film> result = new ArrayList<>();
        for (List<Film> films : filmsBank.values()) {
            result.addAll(films);
        }
        Collections.sort(result);
        return result.subList(0, Math.min(result.size(), 10));
    }
}
