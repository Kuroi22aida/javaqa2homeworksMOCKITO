package ru.netology.domain;

import ru.netology.domain.MovieData;

import static java.lang.System.arraycopy;

public class ManagerAfisha {
    private int countMovies = 10;
    private MovieData[] movies = new MovieData[0];

    public ManagerAfisha(int countMovies) {
        this.countMovies = countMovies;
    }

    public ManagerAfisha() {
    }

    public void add(MovieData movie) {
        MovieData[] tmp = new MovieData[movies.length + 1];
        arraycopy(movies, 0, tmp, 0, movies.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        movies = tmp;
    }

    public MovieData[] findAll() {
        return movies;
    }

    public MovieData[] findLast() {

        MovieData[] newResult = new MovieData[countMovies];
        int count = 0;
        for (int i = 0; i < countMovies; i++) {
            int index = movies.length - i - 1;
            if (movies[index] != null) {
                newResult[count] = movies[index];
                count++;
            }
        }
        MovieData[] result = new MovieData[count];
        arraycopy(newResult, 0, result, 0, count);

        return result;


    }

}