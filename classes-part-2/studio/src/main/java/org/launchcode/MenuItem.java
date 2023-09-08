package org.launchcode;

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private boolean isNew;

    public MenuItem(double p, String d, String c, boolean iN) {
        this.price = p;
        this.description = d;
        this.category = c;
        this.isNew = iN;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public boolean isNew() {
        return isNew;
    }
    public void displayItem() {
        System.out.println("Price: $" + price);
        System.out.println("Description: " + description);
        System.out.println("Category: " + category);
        System.out.println("New Item: " + (isNew ? "Yes" : "No"));
    }
}

