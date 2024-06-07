package com.oops.inheritence;

public class GermanSepard extends Dog{

    String intelligence;

    public GermanSepard() {
    }

    public GermanSepard(String intelligence) {
        this.intelligence = intelligence;
    }

    public GermanSepard(int legsNumber, String intelligence) {
        super(legsNumber);
        this.intelligence = intelligence;
    }

    public GermanSepard(float height, String color, String voice, float weight, int legsNumber, String intelligence) {
        super(height, color, voice, weight, legsNumber);
        this.intelligence = intelligence;
    }

    public String getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(String intelligence) {
        this.intelligence = intelligence;
    }

    @Override
    public String toString() {
        return "GermanSepard [intelligence=" + intelligence + ", toString()="
                + super.toString() + "]";
    }


    
}
