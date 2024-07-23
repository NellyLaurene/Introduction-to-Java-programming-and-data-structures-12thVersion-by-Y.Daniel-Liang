package chapter2;

import java.util.Scanner;
public class Qn8 {
//     (Current time) Listing 2.7, ShowCurrentTime.java, gives a program that displays
//    the current time in GMT. Revise the program so it prompts the user to enter the
//    time zone offset to GMT and displays the time in the specified time zone.

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your GMT time zone: ");
        int timeZone = scanner.nextInt();

        long milliseconds = System.currentTimeMillis();

        long seconds = milliseconds / 1000;
        long currentSeconds = seconds % 60;

        long minutes = seconds / 60;
        long currentMinutes = minutes % 60;

        long hours = minutes / 60;
        long currentHour = (hours % 24) + timeZone;

        System.out.println(currentHour + ":" + currentMinutes + ":" + currentSeconds);
    }
}
