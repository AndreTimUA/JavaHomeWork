package com.pb.timoshenko.hw5;

public class Book {
    private String name;
    private String author;
    private int year;

    public Book(String name, String author, int year){
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getName(){
        return name;
    }
    public String getAuthor(){
        return author;
    }
    public int getYear(){
        return year;
    }

    public void infoBook(){
        System.out.print(name + " (" + author + " " + year + "г.)" );
    }


}
