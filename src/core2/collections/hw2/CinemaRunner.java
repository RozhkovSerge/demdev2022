package core2.collections.hw2;

import java.util.Arrays;

/**
 Задание 1

 Даны 2 класса:
 - Фильм с 5-ю полями: Уникальный Целочисленный идентификатор (id), Год издания, Месяц издания, Жанр и Рейтинг;
 - Кинотеатр, где есть всего лишь одно единственное поле: отсортированный ассоциативный массив, где ключом является год издания, а значением - все фильмы, выпустившиеся в этом году.

 Добавить функционал в кинотеатр таким образом, чтобы можно было:
 - добавлять в него новый фильм
 - получить все фильмы по переданному году
 - получить все фильмы по переданному году и месяцу
 - получить все фильмы по переданному жанру
 - получать ТОП-10 фильмов отсортированные по Рейтингу в порядке убывания

 Учесть следующее:
 - в кинотеатре фильмы должны храниться в порядке их добавления в него (т.е. предусмотреть порядок значения ассоциативного массива)
 - не должен добавляться фильм, если такой уже есть в кинотеатре

 Продемонстрировать работу кинотеатра в отдельном классе.
 */

public class CinemaRunner {

    public static void main(String[] args) {
        Film film1 = new Film(1, 2020, 3, "Blockbuster", 4);
        Film film2 = new Film(2, 2020, 5, "Comedy", 3);
        Film film3 = new Film(3, 2020, 1, "SciFi", 5);
        Film film4 = new Film(1, 2012, 7, "Comedy", 5);
        Film film5 = new Film(2, 2012, 2, "Drama", 3);
        Film film6 = new Film(3, 2012, 8, "Horror", 3);
        Film film7 = new Film(1, 2015, 11, "Comedy", 4);
        Film film8 = new Film(2, 2015, 10, "Blockbuster", 5);
        Film film9 = new Film(3, 2015, 9, "Drama", 5);

        Cinema cinema = new Cinema();

        for (Film film : Arrays.asList(film1, film2, film3, film4, film5, film6, film7, film8, film9)) {
            cinema.addFilm(film);
        }

        System.out.println(cinema.getFilmsByGenre("Drama"));
        System.out.println("------------------------------------------------------");
        System.out.println(cinema.getFilmsByProductionYear(2020));
        System.out.println("------------------------------------------------------");
        System.out.println(cinema.getFilmsByProductionYearAndMonth(2015,10));
        System.out.println("------------------------------------------------------");
        cinema.getTopTenSortedByRate().forEach(System.out::println);


    }
}
