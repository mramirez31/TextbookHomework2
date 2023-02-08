/**
 * @Class: TimeConversion
 * @Author: Miguel Ramirez
 * @Version: 1.0
 * @Course: ITEC 2140 Section 05 Spring 2023
 * @Written: February 2, 2023
 * @description: In this program we will write a code that will convert a
 * given amount of seconds into hours, minutes and seconds by using the
 * total numbers of seconds given by the user and convert those second
 * to time.
 *
 */

import java.util.Scanner;
public class TimeConversion {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the total number of seconds you want to convert: ");
        int total_Number_Of_Seconds = input.nextInt();

        int hours = total_Number_Of_Seconds / 3600;
        int minutes = (total_Number_Of_Seconds % 3600) / 60;
        int seconds = total_Number_Of_Seconds % 60;

        System.out.println("If the total number of seconds is " + total_Number_Of_Seconds + "," + "there is " + hours + " hours" + ", " + minutes + " minutes" + " and " + seconds + " seconds.");

    }
}
