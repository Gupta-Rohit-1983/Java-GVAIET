package com.demo;

import java.util.Scanner;

// Main class for CodeQuest: Java Adventures
public class CodeQuestGame {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Player player = new Player();

            // Game introduction
            System.out.println("Welcome to CodeQuest: Java Adventures!");
            System.out.println("Embark on a journey to save the virtual world by mastering Java programming.");

            // Main game loop
            while (true) {
                displayMainMenu();

                // Get user choice
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                // Handle user choice
                switch (choice) {
                    case 1:
                        startQuest(player);
                        break;
                    case 2:
                        showHandbook();
                        break;
                    case 3:
                        System.out.println("Exiting CodeQuest. Goodbye!");
                        return; // Exit program
                    default:
                        System.out.println("Invalid choice. Please choose again.");
                }
            }
        }
    }

    // Method to display main menu options
    private static void displayMainMenu() {
        System.out.println("\nMain Menu:");
        System.out.println("1. Start Quest");
        System.out.println("2. View Handbook");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
    }

    // Method to start a quest
    private static void startQuest(Player player) {
        // Simulated quest gameplay
        System.out.println("\nStarting a new quest...");
        System.out.println("You encounter a challenge that requires writing Java code.");

        // Simulated coding challenge
        System.out.println("\nChallenge: Write a Java program to print 'Hello, world!'");
        System.out.println("Enter your Java code below:");

        try (Scanner scanner = new Scanner(System.in)) {
            String userCode = scanner.nextLine();

            // Check if user's code is correct (simplified check for demonstration)
            if (userCode.contains("System.out.println(\"Hello, world!\")")) {
                System.out.println("\nCongratulations! You solved the challenge.");
                player.incrementExperience(100); // Increase player's experience points
            } else {
                System.out.println("\nSorry, your code is incorrect. Please try again.");
            }
        }
    }

    // Method to show the handbook (simplified for demonstration)
    private static void showHandbook() {
        System.out.println("\n--- Java Handbook ---");
        System.out.println("This is a simplified version of the handbook.");
        System.out.println("It contains reference materials and explanations of Java syntax and concepts.");
    }
}

// Player class
class Player {
    private int experience;

    // Constructor
    public Player() {
        this.experience = 0;
    }

    // Method to increment experience points
    public void incrementExperience(int points) {
        experience += points;
        System.out.println("You earned " + points + " experience points.");
        System.out.println("Total experience: " + experience);
    }
}
