package com.practice.association;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Address {

    @Id
    private int add_id;

    private String area;
    private String landMark;
    private int pincode;
    private String city;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "address")
    private Student student;

    public Address() {
    }

    public Address(int add_id, String area, String landMark, int pincode, String city, Student student) {
        this.add_id = add_id;
        this.area = area;
        this.landMark = landMark;
        this.pincode = pincode;
        this.city = city;
        this.student = student;
    }

    public int getAdd_id() {
        return add_id;
    }

    public void setAdd_id(int add_id) {
        this.add_id = add_id;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getLandMark() {
        return landMark;
    }

    public void setLandMark(String landMark) {
        this.landMark = landMark;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Address [add_id=" + add_id + ", area=" + area + ", landMark=" + landMark + ", pincode=" + pincode
                + ", city=" + city + ", student=" + student + "]";
    }

}
