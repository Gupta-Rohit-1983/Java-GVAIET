package com.student.entities;

public class Address {

    private String area;
    private String landMark;
    private int pincode;
    private String city;

    public Address() {
    }

    public Address(String area,String landMark, int pincode, String city) {
        this.landMark = landMark;
        this.area = area;
        this.pincode = pincode;
        this.city = city;
    }

    public String getLandMark() {
        return landMark;
    }

    public void setLandMark(String landMark) {
        this.landMark = landMark;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
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

    @Override
    public String toString() {
        return "Address [landMark=" + landMark + ", area=" + area + ", pincode=" + pincode + ", city=" + city + "]";
    }

   

}
