package com.oops.inheritence;

public class Animal {

    private float height;
    private String color;
    private String voice;
    private float weight;
    
    public Animal() {
    }

    public Animal(float height, String color, String voice, float weight) {
        this.height = height;
        this.color = color;
        this.voice = voice;
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal [height=" + height + ", color=" + color + ", voice=" + voice + ", weight=" + weight + "]";
    }
    
    


}
