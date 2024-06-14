package com.sessions;

import java.text.ParseException;

public class testingProject {
    public static void main(String [] args) {

       Library lib1 = new Library();
       lib1.addBookToCatalog("ITT",200,2.99f,"Neelu");
       lib1.addBookToCatalog("OPP",300,3.99f,"Teelu");
       lib1.addBookToCatalog("OCP",400,4.99f,"Keelu");

       lib1.getBookDetails("IPT");
       lib1.getAllBooksDetails(lib1.booksList);

       //float rent = lib1.calculateRent(lib1.rent("ITT"));

       System.out.println("Rent is : " + lib1.calculateRent(lib1.rent("ITT")));

    }
}
