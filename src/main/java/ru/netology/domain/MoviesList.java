package ru.netology.domain;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data

public class MoviesList {
    private int movieId;
    private String movieName;

    public MoviesList(int movieId, String movieName) {
        this.movieId = movieId;
        this.movieName = movieName;
    }
}
