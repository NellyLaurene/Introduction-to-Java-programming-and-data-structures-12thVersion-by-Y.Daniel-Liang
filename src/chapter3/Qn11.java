package chapter3;

import java.util.Scanner;

public class Qn11 {
    //     (Find the number of days in a month) Write a program that prompts the user
//    to enter the month and year and displays the number of days in the month. For
//    example, if the user entered month 2 and year 2012, the program should display
//    that February 2012 has 29 days. If the user entered month 3 and year 2015, the
//    program should display that March 2015 has 31 days.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a month: ");
        int month = scanner.nextInt();

        System.out.println("Enter a Year: ");
        int year = scanner.nextInt();

        int february = 0;
        if((year % 4 == 0 && year % 100 !=10) || (year % 400 == 0)){
            february = 29;
        }else {
            february = 28;
        }

        switch (month){
            case 1 -> System.out.println(year+" January has 31 days");
            case 2 -> System.out.println(year+" February has " +february+" days");
            case 3 -> System.out.println(year+" March has 31 days");
            case 4 -> System.out.println(year+" April has 30 days");
            case 5 -> System.out.println(year+" May has 31 days");
            case 6 -> System.out.println(year+" June has 30 days");
            case 7 -> System.out.println(year+" July has 31 days");
            case 8 -> System.out.println(year+" August has 31 days");
            case 9 -> System.out.println(year+" September has 30 days");
            case 10 -> System.out.println(year+" October has 31 days");
            case 11 -> System.out.println(year+" November has 30 days");
            case 12 -> System.out.println(year+" December has 31 days");
            default -> System.out.println("Invalid month");
        }
    }
}

