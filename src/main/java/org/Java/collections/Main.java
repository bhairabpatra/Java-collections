package org.Java.collections;

import org.Java.collections.arraylist.JavaArrayList;
import org.Java.collections.list.Interface.HashSetExample;
import org.Java.collections.list.Interface.LinkedListExample;
import org.Java.collections.list.Interface.ListInterface;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        ArrayList<JavaArrayList> list=new ArrayList<>();//Creating arraylist
//        list.add(new JavaArrayList("bhairab1"));
//        list.add(new JavaArrayList("bhairab2"));
//        list.add(new JavaArrayList("bhairab3"));
//        System.out.println(list.size());

        //Empty array list
        ArrayList<String> studentName = new ArrayList<>();


        //Add some student name to array list
        studentName.add("jack");
        studentName.add("mike");
        System.out.println(studentName);

        //Extract value form array list
        System.out.println(studentName.get(0));
        System.out.println(studentName.get(1));

        //Set or update array list

        studentName.set(0, "bhairab");
        System.out.println(studentName.get(0));

        //Remove staudent name form list
        studentName.remove(1);
        studentName.add("Test");
        System.out.println(studentName.get(0));
        System.out.println(studentName.size());

        studentName.clear();
        System.out.println(studentName.size());

        ListInterface listInterface = new ListInterface();
        listInterface.showBooks();

        LinkedListExample LL = new LinkedListExample();
        LL.getBooks();

        HashSetExample hs = new HashSetExample();
        hs.hashSet();

    }
}