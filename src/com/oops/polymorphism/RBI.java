package com.oops.polymorphism;

public class RBI extends Bank {

    private String printEquipment;

    public RBI() {
    }

    public RBI(long accNumber, String accType) {
        super(accNumber, accType);
    }

    public RBI(String printEquipment) {
        this.printEquipment = printEquipment;
    }

    public RBI(long accNumber, String accType, String printEquipment) {
        super(accNumber, accType);
        this.printEquipment = printEquipment;
    }

    public String getPrintEquipment() {
        return printEquipment;
    }

    public void setPrintEquipment(String printEquipment) {
        this.printEquipment = printEquipment;
    }

    @Override
    public String toString() {
        return "RBI [printEquipment=" + printEquipment + "]";
    }

    @Override
    public void printAccDetail(){
        System.out.println("Acc Number "+ getAccNumber() + ", Acc type "+ getAccType() + ", Printing Equipment "+ printEquipment);
    }

}
