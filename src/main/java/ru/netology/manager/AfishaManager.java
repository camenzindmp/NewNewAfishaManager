package ru.netology.manager;

import ru.netology.domain.MoviesList;

public class AfishaManager {
    private MoviesList[] movies = new MoviesList[0];
    private int quantityInFeed;
    private int defaultCount = 10;

    public AfishaManager(int quantityInFeed) {
        this.quantityInFeed = quantityInFeed;
    }

    public void add(MoviesList movie) {
        int length = movies.length + 1;
        MoviesList[] tmp = new MoviesList[length];
        //for (int i = 0; i < movies.length; i++) {
        //   tmp[i] = movies[i];
        // }
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        movies = tmp;
    }

    public MoviesList[] getMovies() {
        if (quantityInFeed < 0) {
            quantityInFeed = defaultCount;
        }
        if (quantityInFeed > movies.length) {
            quantityInFeed = movies.length;
        }
        MoviesList[] result = new MoviesList[quantityInFeed];
        for (int i = 0; i < quantityInFeed; i++) {
            int index = quantityInFeed - i - 1;
            result[i] = movies[index];
        }
        return result;
    }
}