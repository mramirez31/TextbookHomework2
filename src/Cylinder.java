/**
 * @Class: Cylinder
 * @Author: Miguel Ramirez
 * @Version: 1.0
 * @Course: ITEC 2140 Section 05 Spring 2023
 * @Written: February 2, 2023
 * @description: In the program of cylinder we will try and calculate for the
 * base area and volume of the cylinder by the given radius of the base circle
 * and the length of the cylinder given by the user and use 3.1416 as our pi value
 * to get our volume and base area of our cylinder.
 */

import java.util.Scanner;
public class Cylinder {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the base circle: ");
        double radius = input.nextDouble();
        System.out.print("Enter the length of the cylinder: ");
        double length = input.nextDouble();
        double piValue = 3.1416;
        double baseArea = piValue * radius * radius;
        double volumeOfCylinder = piValue * radius * radius * length;

        System.out.println("The base area of the cylinder is: " + baseArea);
        System.out.println("The volume of the cylinder is: " + volumeOfCylinder);

    }
}
