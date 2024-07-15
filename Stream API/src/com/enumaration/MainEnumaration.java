package com.enumaration;

public class MainEnumaration {

    enum UserAccess{
        ACTIVE(1,"Active User","All Access"),
        INACTIVE(2,"Inactive User","No Access"),
        SUSPENDED(3,"Suspended User","Login Access for Particular Time"),
        BLOCK(4,"Blocked User","No Access at All.");

        private int srNo;
        private String description;
        private String access;

        private UserAccess(int srNo, String description, String access){
            this.srNo= srNo;
            this.description = description;
            this.access = access;
        }

        public int getSrNo() {
            return srNo;
        }

        public String getDescription() {
            return description;
        }

        public String getAccess() {
            return access;
        }

        
        
    }

    public static void main(String[] args) {
        System.out.println(UserAccess.ACTIVE.getSrNo());

        for (UserAccess userAccess : UserAccess.values()) {
            System.out.println(userAccess.getSrNo() + "." + userAccess.name() + "," + userAccess.getDescription()+"("+userAccess.getAccess()+")");
        }



        
    }

}
