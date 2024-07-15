package com.objectArray;

public class Book {

    private String name;
    private float prices;
    private short pages;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrices() {
        return prices;
    }

    public void setPrices(float prices) {
        this.prices = prices;
    }

    public short getPages() {
        return pages;
    }

    public void setPages(short pages) {
        this.pages = pages;
    }

    public String toStrings(){
        return "Books [Name :" + name + ", Prices :" + prices + ", Pages :" + pages + "]";
    }

}
