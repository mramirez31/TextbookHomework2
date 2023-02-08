/**
 * @Class: PaintForRoom
 * @Author: Miguel Ramirez
 * @Version: 1.0
 * @Course: ITEC 2140 Section 05 Spring 2023
 * @Written: February 2, 2023
 * @description: This program is written to determine the amount of paint that
 * is needed to paint the room walls, doors, and windows given the length, width,
 * and height by the user and find how many gallons or quarts of paint is needed.
 *
 */

import java.util.Scanner;
public class PaintForRoom {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("What is the length of the room: ");
        int length = input.nextInt();
        System.out.print("What is the width of the room: ");
        int width = input.nextInt();
        System.out.print("What is the height of the room: ");
        int height = input.nextInt();
        System.out.println("How many doors does the room have: ");
        int doors = input.nextInt();
        System.out.println("How many windows are in the room: ");
        int windows = input.nextInt();

        int door = doors * 21;
        int window = windows * 15;
        double gallon = 350;
        double quart = gallon / 4;

        int area = (2 * width * height) + (2 * length * height);
        int totalPaint = area - (door + window);

        double paintTotal = totalPaint / gallon;
        double quartsTotal = totalPaint / quart;

        System.out.println("The amount of paint needed in gallons is: " + paintTotal + " gallons.");
        System.out.println("The amount of paint in quarts needed is: " + quartsTotal + " quarts.");



    }
}
