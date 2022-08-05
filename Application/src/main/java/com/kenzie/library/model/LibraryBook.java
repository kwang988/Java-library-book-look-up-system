package com.kenzie.library.model;

import java.util.ArrayList;

public class LibraryBook extends Book {
    //declare properties
    private String isbn;
    private String subjectList;

    //declare constructors
    public LibraryBook() {
        super();
        this.isbn = "";
        this.subjectList = "";
    }

    public LibraryBook(String title, String author) {
        super(title, author);
        this.isbn = "";
        this.subjectList = "";
    }

    @Override
    public String toString() {
        //use IntelliJ code generator to get toString()
        return "LibraryBook{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", subjectList='" + subjectList + '\'' +
                '}';
    }

    @Override
    public void setBookInfo(String detailString) {
        //call split() on detailString
        String[] detailStrArray = detailString.split("\\|");
        this.title = detailStrArray[0];
        this.author = detailStrArray[1];
        this.isbn = detailStrArray[2];
        this.subjectList = detailStrArray[3];
    }

    public String getIsbn() {

        return isbn;
    }

    public void setIsbn(String isbn) {

        this.isbn = isbn;
    }

    public String getSubjectList() {

        return subjectList;
    }

    public void setSubjectList(String subjectList) {

        this.subjectList = subjectList;
    }
}