package org.launchcode;
import java.util.Scanner;
public class HelloCar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the number of miles your car has driven? ");
        float miles = input.nextFloat();

        System.out.println("What is the amount of gas consumed in gallons? ");
        float gas = input.nextFloat();

        float mpg = miles / gas;
        System.out.println("This is your MPG: " + mpg);


    }
}
