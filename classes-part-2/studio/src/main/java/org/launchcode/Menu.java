package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> items;

    public Menu(Date d, ArrayList<MenuItem> items) {
        this.lastUpdated = lastUpdated;
        this.items = items;
    }

    public void setLastUpdated(Date lastUpdated) {

        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void addItem(MenuItem newItem) {
        items.add(newItem);
        lastUpdated = new Date();
    }

    public void removeItem(MenuItem removeItem) {
        items.remove(removeItem);
        lastUpdated = new Date();
    }

    public void printMenu() {
        System.out.println("Menu last updated: " + lastUpdated);
        for (MenuItem item : items) {
            System.out.println("$" + item.getPrice());
            System.out.println("Description: " + item.getDescription());
            System.out.println("Category: " + item.getCategory());
            System.out.println("New Item: " + (item.isNew() ? "Yes" : "No"));
        }
    }
}


