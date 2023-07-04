package ru.netology.java.FilmItem;

public class Main {
    public static void main(String[] args) {
        FilmManager filmManager = new FilmManager(5);

        FilmItem filmItem = new FilmItem(1, "Bloodshot", "боевик");
        filmManager.save(filmItem);
        FilmItem filmItem2 = new FilmItem(2, "Forward", "мультфильм");
        filmManager.save(filmItem2);
        FilmItem filmItem3 = new FilmItem(3, "Отель Белград", "комедия");
        filmManager.save(filmItem3);
        FilmItem filmItem4 = new FilmItem(4, "Gentlemen", "боевик");
        filmManager.save(filmItem4);
        FilmItem filmItem5 = new FilmItem(5, "The Invisible Man", "ужасы");
        filmManager.save(filmItem5);
        FilmItem filmItem6 = new FilmItem(6, "Trolls World Tour", "мультфильм");
        filmManager.save(filmItem6);
        FilmItem filmItem7 = new FilmItem(7, "Номер один", "комедия");
        filmManager.save(filmItem7);

        //filmManager.findAll();
        System.out.println("");

    }


}
