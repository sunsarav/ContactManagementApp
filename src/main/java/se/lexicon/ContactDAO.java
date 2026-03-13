package se.lexicon;

import java.util.HashMap;
import java.util.Map;

public class ContactDAO {
    //Store Contacts using HashMap
    private static final Map<String, String> contacts = new HashMap<>();

    //To add contacts
    public void addContact(String name, String mobile) {

        if (contacts.containsKey(name)) {
            System.out.println("Contact already exists");
        } else {
            contacts.put(name, mobile);
            System.out.println("Contact added Successfully");

        }
    }
    //To display all contacts
    public void displayAllContacts() {

        if (contacts.isEmpty()) {
            System.out.println("No contacts found.");
            return;
        }

        int index = 1;

        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            String name = entry.getKey();
            String mobile = entry.getValue();

            System.out.println(index + " . " + name + " (" + mobile + ")");
            index++;
        }
    }
    //To Search by Name
    public void searchByName(String searchName) {

        boolean found = false;

        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            String name = entry.getKey();
            String mobile = entry.getValue();

            if (name.toLowerCase().contains(searchName.toLowerCase())) {
                System.out.println(name + " (" + mobile + ")");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No contact found.");
        }
    }
}
