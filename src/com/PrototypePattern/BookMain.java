package com.PrototypePattern;

public class BookMain {

    public static void main(String[] args) throws CloneNotSupportedException {
        BookShop bookShop = new BookShop();
        bookShop.setShopName("Sairam");
        bookShop.loadData();


        BookShop bookShop2 =  bookShop.clone();
        bookShop.getBookList().remove(2);
//        bookShop2.setShopName("Bismi");
//        bookShop2.loadData();
        System.out.println(bookShop);
        System.out.println(bookShop2);

    }

}
