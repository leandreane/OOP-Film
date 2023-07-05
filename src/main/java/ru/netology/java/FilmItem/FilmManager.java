package ru.netology.java.FilmItem;

public class FilmManager {

    private FilmItem[] items = new FilmItem[0];
    private int limit;

    public FilmManager() {
        this.limit = 7;
    }

    public FilmManager(int limit) {
        this.limit = limit;
    }

    public void save(FilmItem item) {
        FilmItem[] tmp = new FilmItem[items.length + 1];

        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item;
        items = tmp;
    }

    public FilmItem[] findAll() {

        return items;
    }

    public FilmItem[] findLast() {
        int lastInd = items.length - limit;
        if (lastInd < 0) {
            lastInd = 0;
        }
        FilmItem[] tmp = new FilmItem[limit];
        int b = 0;
        for (int i = items.length - 1; i >= lastInd; i--) {
            tmp[b] = items[i];
            b++;
        }
        return tmp;

    }
}
