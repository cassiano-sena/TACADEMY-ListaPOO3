//Classe Filme:
//Crie uma classe chamada Filme para modelar informações sobre um filme.
//Crie um pequeno sistema de cadastro de livros em uma lista.
//Atributos:
//Métodos: mostrarDetalhes.
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Movie {
    private String title;
    private String genre;
    private String director;
    private int duration; // duration in minutes
    private int releaseYear;

    public Movie(String title, String genre, String director, int duration, int releaseYear) {
        this.title = title;
        this.genre = genre;
        this.director = director;
        this.duration = duration;
        this.releaseYear = releaseYear;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Director: " + director);
        System.out.println("Duration: " + duration + " minutes");
        System.out.println("Release Year: " + releaseYear);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
}
