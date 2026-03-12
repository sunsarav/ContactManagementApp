package se.lexicon;

import java.util.Scanner;

public class ContactManagementApp {

    //Initializing scanner to get input
    static Scanner scanner = new Scanner(System.in);
    static ContactDAO dao = new ContactDAO();

    static void main(String[] args) {


        //getting the menu choice

        boolean choice = true;
        while (choice) {
            displayMenu();
            int input = scanner.nextInt();
            scanner.nextLine();

            switch (input) {

                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.next();
                    System.out.print("Enter mobile: ");
                    String mobile = scanner.next();

                    dao.addContact(name, mobile);
                    displayMenu();
                    break;
                case 2:
                    System.out.println("Search by Name");
                    System.out.println("Enter Name: ");
                    dao.searchByName(scanner.next());
                    break;
                case 3:
                    dao.displayAllContacts();
                    break;
                case 0:
                    System.out.println("Exiting the app - GoodBye");
                    choice =false;
                    break;
                default:
                    System.out.println("Invalid Choice, Please enter 1,2,3 or 0");


            }
        }

    }
        //Application Menu
        static void displayMenu(){
            System.out.println("""
            ============WELCOME TO CONTACT MANAGEMENT=============
            1. Add Contact
            2. Search by Name
            3. Display all Contacts
            0. Exit
            Choose an option:
            """);
        }
}

