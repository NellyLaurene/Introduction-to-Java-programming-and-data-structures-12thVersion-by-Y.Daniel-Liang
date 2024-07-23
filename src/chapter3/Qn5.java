package chapter3;

import java.util.Scanner;
public class Qn5 {
//     (Find future dates) Write a program that prompts the user to enter an integer for
//    today’s day of the week (Sunday is 0, Monday is 1, . . . , and Saturday is 6). Also
//    prompt the user to enter the number of days after today for a future day and display the future day of the week.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter an integer for today’s day of the week (Sunday is 0, Monday is 1, . . . , and Saturday is 6).");
        int day = scanner.nextInt();

        System.out.println("enter the number of days after today for a future day");
        int future = scanner.nextInt();

        int futureDay = (day + future) % 7;
        String fullDay = "";
        switch (futureDay){
            case 0 -> fullDay = "Sunday";
            case 1 -> fullDay = "Monday";
            case 2 -> fullDay = "Tuesday";
            case 3 -> fullDay = "Wednesday";
            case 4 -> fullDay = "Thursday";
            case 5 -> fullDay = "Friday";
            case 6 -> fullDay = "Saturday";
            default -> fullDay = "Invalid";
        }

        System.out.println("in "+future+" it will be on "+fullDay);

    }
}
