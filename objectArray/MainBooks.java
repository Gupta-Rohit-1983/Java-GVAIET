package com.objectArray;

public class MainBooks {
    public static void main(String[] args) {
        Book[] books = new Book[5];
        books[0] = new Book();
        books[0].setName("Who Moved My Chess");
        books[0].setPrices(100);
        books[0].setPages((short) 250);

        System.out.println(books[0].toStrings());
    }

}
  L

  ]k