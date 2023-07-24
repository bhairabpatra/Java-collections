package org.Java.collections.list.Interface;

import java.util.LinkedList;

public class LinkedListExample {
    LinkedList<Book> book = new LinkedList<>();
    Book b1 = new Book("letc c", 120, 1234);
    Book b2 = new Book("java", 567,989);
    Book b3 = new Book("core java", 567,989);

    public  void  getBooks(){
        book.add(b1);
        book.add(b2);
        book.add(b3);
        System.out.println(book.size());
        System.out.println(book.get(1).getBookname());
        book.clear();
        if(book.isEmpty()){
            System.out.println("List is  empty");
        }
    }


}
