package assignment_test;

import java.util.Scanner;

/**
 * Calculation Change Program
 * Author: HUYNH THIEN PHU
 * Date: 24TH JUNE 2023
 * File Name: Client.java
 * Purpose: This program allows users to enter the details of multiple persons, their coin amounts,
 * and perform various operations such as displaying change, finding the person with the smallest
 * or largest amount, calculating total coins, and calculating the total amount for all denominations.
 * Assumptions/Conditions: The program assumes that the user will input valid data as per the program's
 * prompts. The coin values and number of denominations are fixed as per the COIN_VALUES and
 * NUM_COIN_DENOMINATIONS constants.
 */

public class Client {
    public static void main(String[] args) {
        ChangeC[] changes = new ChangeC[10];

        Scanner scanner = new Scanner(System.in);
        int count = 0;
        String name;
        int coinAmount;

        System.out.println("Please enter at least 10 records:");

        while (count < 10) {
            System.out.println("Please enter the name of the person:");
            name = scanner.nextLine();

            if (isNameExists(changes, name)) {
                System.out.println("The name already exists in the system. Please enter a different name.");
                continue;
            }

            System.out.println("Please enter the coin value for the person:");
            coinAmount = Integer.parseInt(scanner.nextLine());

            ChangeC change = new ChangeC(name, coinAmount);
            changes[count] = change;
            count++;

            System.out.println("Do you have more persons to enter? (Y/N)");
            String response = scanner.nextLine().toUpperCase();
            if (!response.equals("Y")) {
                break;
            }
        }

        int choice = 0;
        while (choice != 6) {
            displayMenu();
            System.out.println("Enter your choice:");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("Enter a name:");
                    String enteredName = scanner.nextLine();
                    ChangeC person = findPersonByName(changes, enteredName);
                    if (person != null) {
                        System.out.println("Customer:\n" + person.getName() + " " + person.getCoinAmount() + " pence");
                        System.out.println("Change:");
                        person.displayChange();
                    } else {
                        System.out.println("Name: " + enteredName);
                        System.out.println("Not found");
                    }
                    break;
                case 2:
                    ChangeC smallestAmount = findPersonWithSmallestAmount(changes);
                    if (smallestAmount != null) {
                        System.out.println("Customer:\n" + smallestAmount.getName() + " " + smallestAmount.getCoinAmount() + " pence");
                        System.out.println("Change:");
                        smallestAmount.displayChange();
                    }
                    break;
                case 3:
                    ChangeC largestAmount = findPersonWithLargestAmount(changes);
                    if (largestAmount != null) {
                        System.out.println("Customer:\n" + largestAmount.getName() + " " + largestAmount.getCoinAmount() + " pence");
                        System.out.println("Change:");
                        largestAmount.displayChange();
                    }
                    break;
                case 4:
                    calculateTotalCoins(changes);
                    break;
                case 5:
                    calculateTotalAmount(changes);
                    break;
                case 6:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Enter a name and display change to be given for each denomination");
        System.out.println("2. Find the name with the smallest amount and display change to be given for each denomination");
        System.out.println("3. Find the name with the largest amount and display change to be given for each denomination");
        System.out.println("4. Calculate and display the total number of coins for each denomination");
        System.out.println("5. Calculate and display the total amount for all denominations");
        System.out.println("6. Exit");
    }

    private static boolean isNameExists(ChangeC[] changes, String name) {
        for (ChangeC change : changes) {
            if (change != null && change.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    private static ChangeC findPersonByName(ChangeC[] changes, String name) {
        for (ChangeC change : changes) {
            if (change != null && change.getName().equals(name)) {
                return change;
            }
        }
        return null;
    }

    private static ChangeC findPersonWithSmallestAmount(ChangeC[] changes) {
        ChangeC smallestAmount = null;
        int minAmount = Integer.MAX_VALUE;

        for (ChangeC change : changes) {
            if (change != null && change.getCoinAmount() < minAmount) {
                smallestAmount = change;
                minAmount = change.getCoinAmount();
            }
        }
        return smallestAmount;
    }

    private static ChangeC findPersonWithLargestAmount(ChangeC[] changes) {
        ChangeC largestAmount = null;
        int maxAmount = Integer.MIN_VALUE;

        for (ChangeC change : changes) {
            if (change != null && change.getCoinAmount() > maxAmount) {
                largestAmount = change;
                maxAmount = change.getCoinAmount();
            }
        }
        return largestAmount;
    }

    private static void calculateTotalCoins(ChangeC[] changes) {
        int[] coinCounts = new int[8];

        for (ChangeC change : changes) {
            if (change != null) {
                int[] coins = change.calculateChange();
                for (int i = 0; i < coinCounts.length; i++) {
                    coinCounts[i] += coins[i];
                }
            }
        }

        System.out.println("Total number of coins for each denomination:");
        System.out.println("1p: " + coinCounts[0]);
        System.out.println("2p: " + coinCounts[1]);
        System.out.println("5p: " + coinCounts[2]);
        System.out.println("10p: " + coinCounts[3]);
        System.out.println("20p: " + coinCounts[4]);
        System.out.println("50p: " + coinCounts[5]);
        System.out.println("£1: " + coinCounts[6]);
        System.out.println("£2: " + coinCounts[7]);
    }

    private static void calculateTotalAmount(ChangeC[] changes) {
        int totalAmount = 0;

        for (ChangeC change : changes) {
            if (change != null) {
                totalAmount += change.getCoinAmount();
            }
        }

        System.out.println("Total amount for all denominations: " + totalAmount + " pence");
    }
}
