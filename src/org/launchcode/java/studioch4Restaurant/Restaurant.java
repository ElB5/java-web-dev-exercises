package org.launchcode.java.studioch4Restaurant;

import java.util.Date;
import java.util.ArrayList;
import java.util.Calendar;

public class Restaurant {
    public static void main(String[] args) {
        MenuItems newItem1 = new MenuItems(14.99, "Garlic Pasta", "Dinner", true);
        MenuItems newItem2 = new MenuItems(44.99, "Steak", "Dinner", false);
        MenuItems newItem3 = new MenuItems(4.99, "Garlic Bread", "Appetizer", true);

        Date today = Calendar.getInstance().getTime();
        ArrayList<MenuItems> startingMenu = new ArrayList<>();

        Menu ourMenu = new Menu(today, startingMenu);

        ourMenu.addMenuItem(newItem1);
        ourMenu.addMenuItem(newItem2);
        ourMenu.addMenuItem(newItem3);

        ourMenu.printAllMenuItems();

        ourMenu.printOneMenuItem(newItem1);

        ourMenu.removeMenuItem(newItem2);

        ourMenu.printAllMenuItems();

        ourMenu.updatedDate();

    }
}