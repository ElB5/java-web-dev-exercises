package exercises.ch2DataTypes;

import java.util.Scanner;

public class Miles {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven: ");
        Double miles = input.nextDouble();

        System.out.println("How many gallons of gas did you use: ");
        Double gas = input.nextDouble();

        Double milespergallon = miles / gas;

        System.out.println("The amount of miles you get per gallon is: " + milespergallon);
    }
}
