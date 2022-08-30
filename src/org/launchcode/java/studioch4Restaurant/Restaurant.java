package org.launchcode.java.studioch4Restaurant;

public class Restaurant {
    public static void main(String[] args) {
        MenuItems shrimp = new MenuItems ("shrimp");
        MenuItems steak = new MenuItems ("steak");

        Menu menu = new Menu();
        //add menu item:
        menu.addMenuItems(shrimp);
        menu.addMenuItems(steak);

        //remove menu item:
        menu.removeMenuItems(shrimp);

    //print menu items
//        for(MenuItems item : menu.getMenuItems()) {
//            System.out.println(item.getName());
//        }

//A way to tell when the menu was last updated.
        menu.setLastUpdated();
        System.out.println(menu.getLastUpdated());
        }
}
