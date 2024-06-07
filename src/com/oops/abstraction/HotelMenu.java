package com.oops.abstraction;

public abstract class HotelMenu {

    private int srNo;

    public HotelMenu() {
    }

    public HotelMenu(int srNo) {
        super();
        this.srNo = srNo;
    }

    public int getSrNo() {
        return srNo;
    }

    public void setSrNo(int srNo) {
        this.srNo = srNo;
    }

    public abstract void printMenu();

    @Override
    public String toString() {
        return "HotelMenu [srNo=" + srNo + "]";
    }

    

    

}
