package org.Java.collections.list.Interface;

import java.util.ArrayList;
import java.util.List;

public class ListInterface {

    List<Book> books = new ArrayList<Book>();

    Book b1 = new Book("letc c", 120, 1234);
    Book b2 = new Book("java", 567,989);

    public void showBooks(){
            books.add(b1);
            books.add(b2);
            System.out.println(books.size());
            books.forEach(book -> {

                System.out.println(book.getBookname());
                System.out.println(book.getBookprice());
                System.out.println(book.getPages());
            });
    }




}
