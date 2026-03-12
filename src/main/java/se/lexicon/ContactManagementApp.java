package se.lexicon;

import java.util.Scanner;

public class ContactManagementApp {

    //Initializing scanner to get input
    static Scanner scanner = new Scanner(System.in);

    static void main() {

        displayMenu();
        //getting the menu choice
        int input = scanner.nextInt();
        switch (input) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 0:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Invalid Choice");
                break;

        }

    }
        //Application Menu
        static void displayMenu(){
            System.out.println("""
            ============WELCOME TO CONTACT MANAGEMENT=============
            1. Add Contact
            2. Search by Name
            3. Display all Contacts
            4. Exit
            Choose an option:
            """);
        }

}
