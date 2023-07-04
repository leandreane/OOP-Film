package ru.netology.java.FilmItem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmItemTest {

    @Test
    void save() {
        FilmManager filmManager = new FilmManager(7);
        FilmItem filmItem7 = new FilmItem(7, "Номер один", "комедия");

        FilmItem[] expected = {new FilmItem(7, "Номер один", "комедия")};
        filmManager.save(filmItem7);
        FilmItem[] actual = filmManager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void findAll() {
        FilmManager filmManager = new FilmManager(7);

        FilmItem filmItem = new FilmItem(1, "Bloodshot", "боевик");
        FilmItem filmItem2 = new FilmItem(2, "Forward", "мультфильм");
        FilmItem filmItem3 = new FilmItem(3, "Отель Белград", "комедия");
        FilmItem filmItem4 = new FilmItem(4, "Gentlemen", "боевик");
        FilmItem filmItem5 = new FilmItem(5, "The Invisible Man", "ужасы");
        FilmItem filmItem6 = new FilmItem(6, "Trolls World Tour", "мультфильм");
        FilmItem filmItem7 = new FilmItem(7, "Номер один", "комедия");

        filmManager.save(filmItem);
        filmManager.save(filmItem2);
        filmManager.save(filmItem3);
        filmManager.save(filmItem4);
        filmManager.save(filmItem5);
        filmManager.save(filmItem6);
        filmManager.save(filmItem7);

        FilmItem[] expected = {
                new FilmItem(1, "Bloodshot", "боевик"),
                new FilmItem(2, "Forward", "мультфильм"),
                new FilmItem(3, "Отель Белград", "комедия"),
                new FilmItem(4, "Gentlemen", "боевик"),
                new FilmItem(5, "The Invisible Man", "ужасы"),
                new FilmItem(6, "Trolls World Tour", "мультфильм"),
                new FilmItem(7, "Номер один", "комедия")
        };

        FilmItem[] actual = filmManager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void findLast() {
        FilmManager filmManager = new FilmManager(3);

        FilmItem filmItem = new FilmItem(1, "Bloodshot", "боевик");
        FilmItem filmItem2 = new FilmItem(2, "Forward", "мультфильм");
        FilmItem filmItem3 = new FilmItem(3, "Отель Белград", "комедия");

        filmManager.save(filmItem);
        filmManager.save(filmItem2);
        filmManager.save(filmItem3);

        FilmItem[] expected = {
                new FilmItem(3, "Отель Белград", "комедия"),
                new FilmItem(2, "Forward", "мультфильм"),
                new FilmItem(1, "Bloodshot", "боевик")
        };
        FilmItem[] actual = filmManager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}
