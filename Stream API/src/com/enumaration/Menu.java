package com.enumaration;

import java.util.Scanner;

public class Menu {
    public int printMenu() {

        Scanner sc = new Scanner(System.in);

        for (MenuOption menuOption : MenuOption.values()) {
            System.out.println(menuOption.getSrNo() + "." + menuOption.name() + "," + menuOption.getOptions());
        }

        return sc.nextInt();
        

    }

}
