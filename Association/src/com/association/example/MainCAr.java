package com.association.example;

public class MainCAr {
    public static void main(String[] args) {
        Car car1 = new Car();

        car1.setBrand("BMW");
        car1.setNoOfTyres(4);

        Engine engine = new Engine();
        engine.setPetrol(true);
        engine.setPowerSteering(true);
        engine.setStokes(4);

        car1.setEngine(engine);


        MusicSystem musicSystem = new MusicSystem();
        musicSystem.setFM(true);
        musicSystem.setTouchScreen(true);

        car1.setMusicSystem(musicSystem);

        System.out.println(car1);
    }

}
