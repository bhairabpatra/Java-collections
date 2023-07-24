package org.Java.collections.list.Interface;

public class Book {
    private  String bookname;
    private  int bookprice;
    private  int pages;

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public int getBookprice() {
        return bookprice;
    }

    public void setBookprice(int bookprice) {
        this.bookprice = bookprice;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Book(String bookname, int bookprice, int pages) {
        this.bookname = bookname;
        this.bookprice = bookprice;
        this.pages = pages;
    }
}
