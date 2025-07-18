package com.atmproject;

import java.util.Scanner;

public class TestATMServices {

    static boolean status = true;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        UserDetails user = new UserDetails("Venu Gopal", 3303020, 500, 2121);

        while (status) {
            System.out.print("Enter Your Account Number: ");
            long account = sc.nextLong();

            if (account == user.getAccountNumber()) {
                boolean authenticated = false;

                while (!authenticated) {
                    System.out.print("Enter Your 4 Digit Pin: ");
                    int pin = sc.nextInt();

                    if (pin == user.getPin()) {
                        authenticated = true;
                        showMenu(user);
                    } else {
                        System.out.println("Wrong Pin Entered.");
                    }
                }
            } else {
                System.out.println("Account Number Mismatch.");
            }

            System.out.print("Do you want to use ATM again? (Yes/No): ");
            String answer = sc.next();
            if (!answer.equalsIgnoreCase("yes")) {
                status = false;
            }
        }

        System.out.println("Thank You For Visiting " + user.getUserName());
    }

    static void showMenu(UserDetails user) {
        ATMServices atm = new ATMProcess(user);
        boolean continueMenu = true;

        while (continueMenu) {
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Check Balance ");
            System.out.println("2. Withdraw ");
            System.out.println("3. Deposit ");
            System.out.println("4. Exit ");

            System.out.print("Enter Your Option: ");
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    atm.checkBalance();
                    break;
                case 2:
                    atm.withdraw();
                    break;
                case 3:
                    atm.deposite();
                    break;
                case 4:
                    continueMenu = false; 
                    break;
                default:
                    System.out.println("Enter Valid Option.");
            }

            if (continueMenu) {
                System.out.print("Do you want to continue with this session? (Yes/No): ");
                String choice = sc.next();
                if (!choice.equalsIgnoreCase("yes")) {
                    continueMenu = false;
                }
            }
        }
    }
}  
