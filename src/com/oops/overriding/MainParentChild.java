package com.oops.overriding;

public class MainParentChild {

    public static void main(String[] args) {

        ParentClass parent = new ParentClass();
        parent.setProfession("Bank Clerk");
        parent.printProfession();

        ChildClass child = new ChildClass();
        child.setProfession("Engineer");
        child.printProfession();
    }

}
