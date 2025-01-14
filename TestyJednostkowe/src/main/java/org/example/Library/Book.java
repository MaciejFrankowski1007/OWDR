package org.example.Library;

import java.util.Date;

public class Book {

    private String title;
    private String author;
    private int yearOfPublication;

    private boolean isAvaliable;

    public Book(String title, String author, int yearOfPublication, boolean isAvaliable) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
        this.isAvaliable = true;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public boolean isAvailable() {
        return isAvaliable;
    }

    public void setAvailable(boolean avaliable) {
        isAvaliable = avaliable;
    }

}
