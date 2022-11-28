package com.example.libraryapp;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
//lombok
@Entity(tableName = "book")
public class Book {

    @PrimaryKey(autoGenerate = true)
    private int id;
    private String title;
    private String author;

    public int getId(){return this.id;}

    public void setId(int id){this.id = id;}

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title){this.title = title;}

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author){this.author = author;}

    public Book(String title, String author){
        this.author = author;
        this.title = title;
    }
}
