package org.Java.collections.list.Interface;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

    HashSet<Book> book = new HashSet<>();
    Book b1 = new Book("letc c", 120, 1234);
    Book b2 = new Book("java", 567,989);
    Book b3 = new Book("core java", 567,989);

    public void hashSet(){
        book.add(b1);
        book.add(b2);
        book.add(b3);

//        book.clear();
        System.out.println(book.stream().iterator());
        Iterator<Book> iterator = book.iterator();

        // Using the iterator to traverse the list
        while (iterator.hasNext()) {
            Book fruit = iterator.next();
            System.out.println(fruit.getBookname());
        }

    }
}
