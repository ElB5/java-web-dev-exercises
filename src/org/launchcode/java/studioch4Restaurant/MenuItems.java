package org.launchcode.java.studioch4Restaurant;

public class MenuItems {
    private double price;
    private String description;
    private String category;
    private boolean isNew;

    public MenuItems(double price, String description, String category, boolean isNew) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean setNew(boolean aNew) {
        isNew = aNew;
        return aNew;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    //alert if menu is new or old
    public String isNew() {
        if (isNew == true) {
            return "try this tasty new dish";
        } else {
            return "very old";
        }
    }

    public boolean isEqual(MenuItems comparisonItem) {
        if (this == comparisonItem) {
            return true;
        } else {
            return false;
        }
    }
}

