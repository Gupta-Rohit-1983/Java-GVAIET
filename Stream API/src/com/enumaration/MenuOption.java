package com.enumaration;

public enum MenuOption {

    ADD(1,"Add Record"),
    UPDATE(2,"Update Record"),
    SELECT(3,"Select Record"),
    SELECT_ALL(4,"Select All Record"),
    DELETE(5,"Delete Record"),
    EXIT(6,"Exit from the Program.");

    private int srNo;
    private String options;


    private MenuOption(int srNo, String options){
        this.srNo = srNo;
        this.options = options;
    }


    public int getSrNo() {
        return srNo;
    }


    public String getOptions() {
        return options;
    }

    

}
