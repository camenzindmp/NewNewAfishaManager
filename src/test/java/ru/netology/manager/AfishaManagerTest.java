package ru.netology.manager;


import org.junit.jupiter.api.Test;
import ru.netology.domain.MoviesList;


import javax.xml.namespace.QName;
import static org.junit.jupiter.api.Assertions.*;


public class AfishaManagerTest {
    private AfishaManager manager;
    private MoviesList first = new MoviesList(1, "first");
    private MoviesList second = new MoviesList(2, "second");
    private MoviesList third = new MoviesList(3, "third");
    private MoviesList fourth = new MoviesList(4, "fourth");
    private MoviesList fifth = new MoviesList(5, "fifth");
    private MoviesList sixth = new MoviesList(6, "sixth");
    private MoviesList seventh = new MoviesList(7, "seventh");
    private MoviesList eighth = new MoviesList(8, "eighth");
    private MoviesList ninth = new MoviesList(9, "ninth");
    private MoviesList tenth = new MoviesList(10, "tenth");


    @Test
    public void get10Movies() {
        AfishaManager manager = new AfishaManager(10);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);

        MoviesList[] actual = manager.getMovies();
        MoviesList[] expected = new MoviesList[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void getLessMovies() {
        AfishaManager manager = new AfishaManager(5);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);

        MoviesList[] actual = manager.getMovies();
        MoviesList[] expected = new MoviesList[]{fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void getZeroMovies() {
        AfishaManager manager = new AfishaManager(0);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);

        MoviesList[] actual = manager.getMovies();
        MoviesList[] expected = new MoviesList[]{};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void getMoreMovies() {
        AfishaManager manager = new AfishaManager(11);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);

        MoviesList[] actual = manager.getMovies();
        MoviesList[] expected = new MoviesList[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void getNegativeMovies() {
        AfishaManager manager = new AfishaManager(-2);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);

        MoviesList[] actual = manager.getMovies();
        MoviesList[] expected = new MoviesList[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }
}