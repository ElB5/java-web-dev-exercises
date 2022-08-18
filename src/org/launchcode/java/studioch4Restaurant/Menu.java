package org.launchcode.java.studioch4Restaurant;

import java.util.Date;
import java.util.ArrayList;

public class Menu {

        private String categories;
        private String appetizers;
        private String mainCourse;
        private String dessert;
        //private Date lastUpdated;

        public String getCategories(String categories) {
            return categories;
        }

        public void setCategories(String categories) {
            this.categories = categories;
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


    private Date lastUpdated;

    ArrayList<String> menuItems;


}

