package org.launchcode.java.studioch4Restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItems> items;


    public Menu(Date dateUpdated, ArrayList<MenuItems> item) {
        this.lastUpdated = dateUpdated;
        this.items = item;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItems> items) {
        this.items = items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItems> getItems() {
        return items;
    }

    public void addMenuItem(MenuItems item) {
        this.items.add(item);
    }

    public void removeMenuItem(MenuItems item) {
        this.items.remove(item);
    }

    //return date menu last updated
    public String updatedDate() {
        System.out.println("the menu was last updated " + this.lastUpdated);
        return ("the menu was last updated " + this.lastUpdated);
    }

    //print 1 menu item
    public void printOneMenuItem(MenuItems item){
        System.out.println(item.getDescription());
    }

    //print all menu items, iterates thorugh all items in menu and printing them (no parameters since no additional
    //data needed to execute
    public void printAllMenuItems () {
        for(MenuItems menuItem : this.items) {
            System.out.println(menuItem.getDescription());
        }
    }
}