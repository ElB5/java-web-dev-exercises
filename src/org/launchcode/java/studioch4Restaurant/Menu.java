package org.launchcode.java.studioch4Restaurant;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {

    private ArrayList<MenuItems> menuItems = new ArrayList<>();

    private LocalDate lastUpdated;

    public void addMenuItems(MenuItems name) {
        this.menuItems.add(name);
    }

    public void removeMenuItems(MenuItems name) {
        this.menuItems.remove(name);
    }

    public ArrayList<MenuItems> getMenuItems() {
        return menuItems;
    }

    public LocalDate getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated() {
        this.lastUpdated = LocalDate.now();
    }

        private String categories;
        private String appetizers;
        private String mainCourse;
        private String dessert;
        //private Date lastUpdated;

        private String item;

        public String getCategories(String categories) {
            return categories;
        }

        public void setCategories(String categories) {
            this.categories = categories;
        }

        public String getItem(String item) {
            return item;
        }

        public void setItem(String item){
            this.item = item;
        }

        public String getAppetizers(String appetizers) {
            return appetizers;
        }

        public void setAppetizers(String appetizers) {
            this.appetizers = appetizers;
        }

        public String getMainCourse(String mainCourse) {
            return mainCourse;
        }

        public void setMainCourse(String mainCourse) {
            this.mainCourse = mainCourse;
        }

        public String getDessert(String dessert) {
            return dessert;
        }

        public void setDessert(String dessert) {
            this.dessert = dessert;
        }
}

