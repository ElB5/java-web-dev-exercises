package org.launchcode.java.studioCh2.areaofacircle;

import java.util.Scanner;

public class Area {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter the radius of your circle: ");
            Integer radius = input.nextInt();
//            double pi = 3.14;
            Double areaOfCircle = Circle.getArea((double) radius);
//            double areaOfCircle = pi * radius * radius;
                System.out.println(areaOfCircle);
            System.out.println("The area of a circle of radius " + radius + " is: " + areaOfCircle);
        }
    }
