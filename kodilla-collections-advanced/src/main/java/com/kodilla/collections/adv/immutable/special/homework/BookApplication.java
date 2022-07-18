package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        Book book1 = BookManager.createBook("HP1", "JKR");
        Book book2 = BookManager.createBook("HP2", "JKR");
        Book book3 = BookManager.createBook("HP3", "JKR");
        System.out.println(book1.hashCode() == book2.hashCode());
        System.out.println(book2.hashCode() == book3.hashCode());
        System.out.println(book1.hashCode() == book3.hashCode());
        System.out.println("--------------------");
        Book book4 = BookManager.createBook("HP1", "JKR");

    }
}
