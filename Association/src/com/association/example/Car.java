package com.association.example;

public class Car {

    private int noOfTyres;
    private String brand;

    // Composition
    private Engine engine;

    // Aggregation
    private MusicSystem musicSystem;

    public Car() {
    }

    public Car(int noOfTyres, String brand, Engine engine, MusicSystem musicSystem) {
        this.noOfTyres = noOfTyres;
        this.brand = brand;
        this.engine = engine;
        this.musicSystem = musicSystem;
    }

    public int getNoOfTyres() {
        return noOfTyres;
    }

    public void setNoOfTyres(int noOfTyres) {
        this.noOfTyres = noOfTyres;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public MusicSystem getMusicSystem() {
        return musicSystem;
    }

    public void setMusicSystem(MusicSystem musicSystem) {
        this.musicSystem = musicSystem;
    }

    @Override
    public String toString() {
        return "Car [noOfTyres=" + noOfTyres + ", brand=" + brand + ", engine=" + engine + ", musicSystem="
                + musicSystem + "]";
    }
    
    

}
