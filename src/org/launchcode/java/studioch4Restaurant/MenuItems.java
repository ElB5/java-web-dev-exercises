package org.launchcode.java.studioch4Restaurant;

public class MenuItems {

    private String name;
    private double price;
    private String description;
    private boolean newItem;

    public MenuItems (String name) {
        this.name = name;
    }


    public String getName(String name) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice(double price) {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription(String description) {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean getNewItem(boolean newItem) {
        return newItem;
    }

    public void setNewItem(boolean newItem) {
        this.newItem = newItem;
    }
}

