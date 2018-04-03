package excercises;

import java.util.Scanner;

public class Mpg {
    public static void main(String[] args) {
        float miles;
        float gallons;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("How many miles have you driven? ");
        miles = in.nextFloat();
        System.out.println("How many gallons of gas have you used? ");
        gallons = in.nextFloat();

        System.out.println("Your miles to a gallon of gas is: "+ (miles / gallons));
    }
}
