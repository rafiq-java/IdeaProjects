package com.sessions;

public class Book{
    private String BookName;
    private int BookID;
    private int Pages;
    private float BookRent;
    private String Author;

    public Book(String BookName,int BookID,int Pages,float BookRent,String Author){
        this.BookID = BookID;
        this.BookName = BookName;
        this.Pages = Pages;
        this.BookRent = BookRent;
        this.Author = Author;
    }
    public Book(){

    }
    public String getBookName(){
        return this.BookName;
    }
    public int getBookID(){
        return this.BookID;
    }
    public int getBookPages(){
        return this.Pages;
    }
    public float getBookRent(){
        return this.BookRent;
    }
    public String getBookAuthor(){
        return this.Author;
    }

}
