package com.sessions;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Library {
    List<Book> booksList = new ArrayList<>();

    public Library(){
        booksList.add(new Book("IOT",1,100,1.99f,"Rafiq"));
    }

    public Book addBookToCatalog(String bookName, int pages, float bookRent, String author){
    int x = booksList.size() + 1;
    Book newBook = new Book(bookName,x,pages,bookRent,author);
        booksList.add(newBook);
        return newBook;
    }

    public float getBookRent(String bookName){
        for(Book B1 : booksList){
            if(B1.getBookName() == bookName){
                return B1.getBookRent();
            }
        }
        return 0;
    }
    public Book getBook(String Name){
        for(Book B : booksList){
            if(B.getBookName().equals(Name)){
                return B;
            }
        }
        return null;
    }
    public void getBookDetails(String bookName){
        if(getBook(bookName)!= null){
                    System.out.println('\n' + "com.sessions.Book Name   : " + getBook(bookName).getBookName() + '\n' +
                            "com.sessions.Book ID     : " + getBook(bookName).getBookID() + '\n' +
                            "com.sessions.Book Pages  : " + getBook(bookName).getBookPages() + '\n' +
                            "com.sessions.Book Rent   : " + getBook(bookName).getBookRent() + '\n' +
                            "com.sessions.Book Author : " + getBook(bookName).getBookAuthor() + '\n');
                }else {

            System.out.println('\n' + "com.sessions.Book does not exist. Check the name and try again" + '\n');
        }
    }
    public void getAllBooksDetails(List<Book> booksList){
        if(booksList!= null) {
            for (Book B2 : booksList) {
                System.out.println("com.sessions.Book Name   : " + B2.getBookName() + '\n' +
                        "com.sessions.Book ID     : " + B2.getBookID() + '\n' +
                        "com.sessions.Book Pages  : " + B2.getBookPages() + '\n' +
                        "com.sessions.Book Rent   : " + B2.getBookRent() + '\n' +
                        "com.sessions.Book Author : " + B2.getBookAuthor() + '\n');
            }
        }
    }
    public void removeFromCatalog(String Name) {
        if (getBook(Name) != null) {
            booksList.remove(getBook(Name));
        }
       // System.out.println("Removed " + Name + " from the catalog" + '\n');
    }

    public rentedBook rent(String bookName){
        Book bookToBeRented = getBook(bookName);
        rentedBook rentedBook = new rentedBook(bookToBeRented);
        removeFromCatalog(bookName);
        return rentedBook;
    }
    public float calculateRent(rentedBook rentedBook){
        float rent = 0;
        long numberOfDays = ChronoUnit.DAYS.between(rentedBook.getRentedDate(), LocalDate.now());

        if(numberOfDays >= 5){
            rent = numberOfDays * rentedBook.getBook().getBookRent() * 1;
        }else{
            rent = numberOfDays * rentedBook.getBook().getBookRent() * 0.5f;
        }
        return rent;
    }

    public List<Book> getBooks(){
        return this.booksList;
    }
}
