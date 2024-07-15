package com.student.entities;

public class Student {

    private int rollNO;
    private String name;
    private String courseName;
    private Address address;

    public Student() {
    }

    public Student(int rollNO, String name, String courseName, Address address) {
        this.name = name;
        this.rollNO = rollNO;
        this.courseName = courseName;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNO() {
        return rollNO;
    }

    public void setRollNO(int rollNO) {
        this.rollNO = rollNO;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", rollNO=" + rollNO + ", courseName=" + courseName + ", address=" + address
                + "]";
    }

}
