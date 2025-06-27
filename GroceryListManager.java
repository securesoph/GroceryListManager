// This program help me make grocery list so I don’t forget stuff

import java.util.ArrayList;
import java.util.Scanner;

public class GroceryListManager {
    public static void main(String[] args) {
        // Open scanner to read what I type
        Scanner input = new Scanner(System.in);

        // Make empty list to keep my items
        ArrayList<String> groceryList = new ArrayList<>();

        boolean keepGoing = true;

        // Keep showing menu until I pick exit
        while (keepGoing) {
            // Show options
            System.out.println("Pick: 1) Add 2) Remove 3) View 4) Exit");
            int choice = input.nextInt();
            input.nextLine(); // eat enter

            if (choice == 1) {
                // Add item part
                System.out.println("Type what to add:");
                String item = input.nextLine();
                groceryList.add(item); // put item in list
                System.out.println(item + " added to list.");
            } else if (choice == 2) {
                // Remove item part
                System.out.println("Type what to remove:");
                String item = input.nextLine();
                if (groceryList.contains(item)) {
                    groceryList.remove(item); // take out item
                    System.out.println(item + " removed from list.");
                } else {
                    // If item not there
                    System.out.println(item + " not in list.");
                }
            } else if (choice == 3) {
                // Show list part
                if (groceryList.isEmpty()) {
                    System.out.println("List empty.");
                } else {
                    System.out.println("Your list now:");
                    for (String i : groceryList) {
                        System.out.println(i);
                    }
                }
            } else if (choice == 4) {
                // End program
                keepGoing = false;
                System.out.println("Bye bye!");
            } else {
                // If I type wrong number
                System.out.println("Not a choice. Try again.");
            }
        }

        // Close scanner when done
        input.close();
    }
}
