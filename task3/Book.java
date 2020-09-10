package task3;

import java.lang.*;
public class Book
{
    private String name;
    private String genre;

    public Book(String name,String genre)
    {
        this.name = name;
        this.genre = genre;
        System.out.println("This book is called " + name + ". It is written in the genre " + genre);
    }

    public Book(String genre)
    {
        this.genre = genre;
        System.out.println("This book is written in the genre " + genre);
    }

    public Book()
    {
        System.out.println("I don't know what kind of book it is");
    }
}
