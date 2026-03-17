package LEVEL1;

import java.util.Scanner;
public class HeightConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your height in centimeters: ");
        double heightCm = input.nextDouble();
        double inchValue = 2.54; // 1 inch = 2.54 cm
        double inchesPerFoot = 12; // 1 foot = 12 inches
        double totalInches = heightCm/inchValue;
        int heightFeet = (int) (totalInches/inchesPerFoot);
        double heightInches = totalInches % inchesPerFoot;
        System.out.println("Your Height in cm is " + heightCm +
                            " while in feet is " + heightFeet +
                            " and inches is " + heightInches);

        input.close();
    }
} 
