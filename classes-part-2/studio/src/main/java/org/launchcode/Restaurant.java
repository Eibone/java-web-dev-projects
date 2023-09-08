package org.launchcode;
import java.util.Date;
import java.util.ArrayList;

public class Restaurant {
    public static void main(String[] args) {
    MenuItem item1 = new MenuItem(13.99, "Kahlua Pork", "Hawaiian", true);
    MenuItem item2 = new MenuItem(8.99, "Burger", "Burger", false);
    MenuItem item3 = new MenuItem(6.99, "Salad", "Soup and Salads", false);

    ArrayList<MenuItem> menuItems = new ArrayList<>();
    menuItems.add(item1);
    menuItems.add(item2);
    menuItems.add(item3);

    Menu menu = new Menu(new Date(), menuItems);
    menu.printMenu();

    System.out.println("\nIndividual Menu Item: ");
    item1.displayItem();

    System.out.println("\nRemoving an item from the menu.");
    menu.removeItem(item3);
    menu.printMenu();



    }

}
