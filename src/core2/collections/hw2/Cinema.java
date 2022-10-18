package core2.collections.hw2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Cinema {

    private final Map<Integer, Set<Film>> filmsMap = new LinkedHashMap<>();

    public void addFilm(Film filmToAdd) {
        if (!filmsMap.containsKey(filmToAdd.getProductionYear())) {
            Set<Film> yearRecord = new LinkedHashSet<>();
            yearRecord.add(filmToAdd);
            filmsMap.put(filmToAdd.getProductionYear(), yearRecord);
        } else {
            filmsMap.get(filmToAdd.getProductionYear()).add(filmToAdd);
        }
    }


    public Set<Film> getFilmsByProductionYear(int year) {
        return filmsMap.getOrDefault(year, Collections.emptySet());
    }

    public Set<Film> getFilmsByProductionYearAndMonth(int year, int month) {
        Set<Film> filmsByYear = filmsMap.get(year);
        if (!filmsByYear.isEmpty()) {
            Set<Film> result = new LinkedHashSet<>();
            for (Film film : filmsByYear) {
                if (film.getProductionMonth() == month) {
                    result.add(film);
                }
            }
            return result;
        }
        return Collections.emptySet();
    }

    public List<Film> getFilmsByGenre(String genre) {
        List<Film> result = new ArrayList<>();
        for (Set<Film> films : filmsMap.values()) {
            for (Film film : films) {
                if (film.getGenre().equals(genre)) {
                    result.add(film);
                }
            }
        }
        return result;
    }

    public List<Film> getTopTenSortedByRate() {
        List<Film> result = new ArrayList<>();
        for (Set<Film> films : filmsMap.values()) {
            result.addAll(films);
        }
        Collections.sort(result);
        return result.subList(0, Math.min(result.size(), 10));
    }
}
