package ru.netology.manager;

import lombok.ToString;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.ManagerAfisha;
import ru.netology.domain.MovieData;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ManagerAfishaTest {
    ManagerAfisha manager = new ManagerAfisha(5);
    ManagerAfisha manager2 = new ManagerAfisha();
    private MovieData first = new MovieData(1, "Бладшот");
    private MovieData second = new MovieData(2, "Вперед");
    private MovieData third = new MovieData(3, "Отель Белград");
    private MovieData four = new MovieData(4, "Джентельмены");
    private MovieData five = new MovieData(5, "Человек-невидимка");
    private MovieData six = new MovieData(6, "Тролли. Мировой тур");
    private MovieData seven = new MovieData(7, "Номер один");
    private MovieData eight = new MovieData(8, "Восьмой");
    private MovieData nine = new MovieData(9, "Девятый");
    private MovieData ten = new MovieData(10, "Десятый");
    private MovieData film = new MovieData(11, "Фильм");

    @BeforeEach
    void prepareManager() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(four);
        manager.add(five);
        manager.add(six);
        manager.add(seven);
        manager.add(eight);
        manager.add(nine);
        manager.add(ten);

    }

    @BeforeEach
    void prepareManager2() {
        manager2.add(first);
        manager2.add(second);
        manager2.add(third);
        manager2.add(four);
        manager2.add(five);
        manager2.add(six);
        manager2.add(seven);
        manager2.add(eight);
        manager2.add(nine);
        manager2.add(ten);

    }

    @Test
    public void shouldAdd() {
        manager.add(film);

        MovieData[] actual = manager.findAll();
        MovieData[] expected = new MovieData[]{
                first, second, third, four, five, six, seven, eight, nine, ten, film
        };
        assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldFindLast() {
        MovieData[] actual = manager.findLast();
        MovieData[] expected = {ten, nine, eight, seven, six};
        assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldFindLast2() {
        MovieData[] actual = manager2.findLast();
        MovieData[] expected = {ten, nine, eight, seven, six, five, four, third, second, first};
        assertArrayEquals(expected, actual);
    }


}
