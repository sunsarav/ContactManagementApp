package se.lexicon;

import javax.lang.model.element.Name;
import java.util.Scanner;

public class ContactManagementApp {

    //Initializing scanner to get input
    static Scanner scanner = new Scanner(System.in);
    static ContactDAO dao = new ContactDAO();

    static void main(String[] args) {

        displayMenu();
        //getting the menu choice
        int input = scanner.nextInt();

        switch (input) {
            case 1:System.out.print("Enter name: ");
                scanner.nextLine();
                String name = scanner.nextLine();

                System.out.print("Enter mobile: ");
                String mobile = scanner.nextLine();

                dao.addContact(name, mobile);
                break;
            case 2:
                System.out.println("Search by Name");

                break;
            case 3:
                System.out.println("Display all contacts");
                dao.displayAllContacts();
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

