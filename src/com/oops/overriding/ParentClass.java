package com.oops.overriding;

public class ParentClass {

    private String profession;

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public void printProfession(){
        System.out.println("Profession of Parent is :" + getProfession());
    }
    

}
