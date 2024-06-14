package com.sessions;

import java.time.LocalDate;
import java.util.Date;

public class rentedBook {
    private Book book;
    private LocalDate rentedDate;

    public rentedBook(Book book){
        this.book = book;
        this.rentedDate = LocalDate.now();
    }
    public LocalDate getRentedDate(){ return this.rentedDate;}
    public Book getBook(){return this.book;}
}
