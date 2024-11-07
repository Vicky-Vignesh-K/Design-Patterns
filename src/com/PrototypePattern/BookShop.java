package com.PrototypePattern;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable{

    String shopName;
    List<Book> bookList = new ArrayList<>();

    public void loadData() {
        for (int i = 1; i < 5; i++) {
            Book book = new Book();
            book.setId(i);
            book.setName("Book " + i);
            getBookList().add(book);
        }
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    @Override
    public String toString() {
        return "BookShop{" + "shopName='" + shopName + '\'' + ", bookList=" + bookList + '}';
    }

    public BookShop clone() throws CloneNotSupportedException {
        BookShop bookShop = new BookShop();
        for(Book book : this.getBookList()){
            bookShop.getBookList().add(book);
        }
        return bookShop;
    }
}
