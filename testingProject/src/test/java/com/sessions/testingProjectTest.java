package com.sessions;

import org.hamcrest.collection.HasItemInArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.*;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;
@ExtendWith({MockitoExtension.class})

class testingProjectTest {

    Library library;

    @BeforeEach
    public void setup(){
    library = new Library();
}

    @Test
    public void the_default_number_of_books_should_be_1_initially(){
    int numberOfBooks = library.getBooks().size();

    assertEquals(1,numberOfBooks);
 }
 @Test
    public void add_to_catalog_should_add_book_to_List_and_size_should_increase_by_1_and_created_book_id_should_be_size_plus_1(){
   //  Library library = new Library();
     Book newlyCreatedBook = library.addBookToCatalog("IOT",200,3.9f,"Tori");
     int totalBooks = library.getBooks().size();
     List<Book> availableBooks = library.getBooks();
     assertEquals(2,totalBooks);

     assertThat(newlyCreatedBook.getBookID(),equalTo(2));
     assertThat(availableBooks,hasItem(newlyCreatedBook));

 }
 @Test
    public void get_book_rent_should_return_book_rent_of_current_book_name(){
  //   Library library = new Library();
     Book newwlyCreatedBook = library.addBookToCatalog("ICP",300,4.88f,"Randy");
     assertThat(newwlyCreatedBook.getBookRent(),equalTo(4.88f));
 }

 @Test
    public void get_book_should_return_book_with_name_passed(){
  //   Library library = new Library();
     Book book = library.getBook("IOT");
     assertThat(book.getBookName(),equalTo("IOT"));
 }
 @Test
    public void remove_from_catalog_should_remove_book_from_library_and_reduce_library_size_by_1(){
  //   Library library = new Library();
     library.addBookToCatalog("ICP",300,8.1f,"Karina");
     int size = library.getBooks().size();
     library.removeFromCatalog("IOT");
     assertThat(library.getBooks().size(),lessThan(size));
     List<Book> availableBooks = library.getBooks();
     Boolean y = availableBooks.contains(library.getBook("IOT"));
     Assertions.assertFalse(y);
 }
 @Test
    public void calculate_rent_method_should_return_value_based_on_number_of_days(){
     //  Library newLibrary = Mockito.spy(Library.class);

     Book book = new Book("POP",2,300,5.0f,"Rafiq");
     rentedBook rentedBook = new rentedBook(book);
     rentedBook rentedBookSpied = Mockito.spy(rentedBook);
     //rentedBook rentedBook1 = new rentedBook(book);
   //  newLibrary.addBookToCatalog(book.getBookName(), book.getBookPages(), book.getBookRent(), book.getBookAuthor());
     LocalDate fourdaysback = LocalDate.now().minusDays(10);
     library.addBookToCatalog(book);
     Mockito.when(rentedBookSpied.getRentedDate()).thenReturn(fourdaysback);
     int x = library.booksList.size();
    // Book book = new Book("PPP",2,300,10.0f,"rafiq");
     Mockito.when(rentedBookSpied.getBook()).thenReturn(book);
     float calculatedRent = library.calculateRent(rentedBookSpied);

     assertThat(calculatedRent,equalTo(50f));


 }
}