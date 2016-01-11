package udemyarraylist;

import java.util.Scanner;

public class Main {
    private static Scanner in = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice;

        printInstructions();
        while (!quit) {
            System.out.println("Enter you choice: ");
            choice = in.nextInt();
            in.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    private static void searchForItem() {
        System.out.print("Item to search for: ");
        String searchItem = in.nextLine();
        if (groceryList.findItem(searchItem) != null) {
            System.out.println("Found " + searchItem);
        } else {
            System.out.println("Not Found: " + searchItem);
        }
    }

    private static void removeItem() {
        System.out.print("Enter item number: ");
        int itemNo = in.nextInt();
        in.nextLine();
        groceryList.removeGroceryItem(itemNo - 1);
    }

    private static void modifyItem() {
        System.out.print("Enter item number: ");
        int itemNo = in.nextInt();
        in.nextLine();
        System.out.print("Enter new item: ");
        String newItem = in.nextLine();
        groceryList.modifyGroceryItem(itemNo - 1, newItem);
    }

    private static void addItem() {
        System.out.print("Enter the grocery item: ");
        groceryList.addGroceryItem(in.nextLine());
    }

    private static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options");
        System.out.println("\t 1 - To print the list of grocery items");
        System.out.println("\t 2 - To add an item to the list");
        System.out.println("\t 3 - To modify an item in the list");
        System.out.println("\t 4 - To remove an item from the list");
        System.out.println("\t 5 - To search for an item in the list");
        System.out.println("\t 6 - to quit the application");
    }
}
