package core2.collections.hw2;

import java.util.Objects;

public class Film implements Comparable<Film> {
    private int id;
    private int productionYear;
    private int productionMonth;
    private String genre;
    private int rate;

    public Film(int id, int productionYear, int productionMonth, String genre, int rate) {
        this.id = id;
        this.productionYear = productionYear;
        this.productionMonth = productionMonth;
        this.genre = genre;
        this.rate = rate;
    }

    public int getId() {
        return id;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public int getProductionMonth() {
        return productionMonth;
    }

    public String getGenre() {
        return genre;
    }

    public int getRate() {
        return rate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Film film = (Film) o;
        return productionYear == film.productionYear && productionMonth == film.productionMonth && Objects.equals(genre, film.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productionYear, productionMonth, genre);
    }

    @Override
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", productionYear=" + productionYear +
                ", productionMonth=" + productionMonth +
                ", genre='" + genre + '\'' +
                ", rate=" + rate +
                '}';
    }

    @Override
    public int compareTo(Film o) {
        return o.getRate() - this.getRate();
    }
}
