package com.vicky.bookfinder.entity;

// POJO -> ENTITY (Database Table mirror class)
public class Book {
    private int id;
    private String name;
    private String author;

    private String created;

    Book(){

    }

    public Book(int id, String name, String author, String created) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.created = created;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", created='" + created + '\'' +
                '}';
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }
}
