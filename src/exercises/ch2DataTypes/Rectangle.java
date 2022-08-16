package exercises.ch2DataTypes;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of rectangle: ");
        Double rectangleL = input.nextDouble();

        System.out.println("Enter width of rectangle: ");
        Double rectangleW = input.nextDouble();

        Double areaOfRectangle = rectangleL * rectangleW;
        System.out.println(areaOfRectangle);


    }
}
