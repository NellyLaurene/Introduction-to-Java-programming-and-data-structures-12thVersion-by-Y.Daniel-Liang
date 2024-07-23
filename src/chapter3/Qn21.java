package chapter3;

import java.util.Scanner;

public class Qn21 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the year: ");
        int year = scanner.nextInt();
        System.out.println("Enter the month: ");
        int month = scanner.nextInt();
        System.out.println("Enter the day of the month: ");
        int day = scanner.nextInt();

        if (month == 1 || month == 2) {
            month += 12;
            year--;
        }

        int q = day;
        int m = month;
        int k = year % 100;
        int j = year / 100;

        int h = (q + (26 * (m + 1)) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;

        switch (h){
            case 0 -> System.out.println("Day of the week is Saturday");
            case 1 -> System.out.println("Day of the week is Sunday");
            case 2 -> System.out.println("Day of the week is Monday");
            case 3 -> System.out.println("Day of the week is Tuesday");
            case 4 -> System.out.println("Day of the week is Wednesday");
            case 5 -> System.out.println("Day of the week is Thursday");
            case 6 -> System.out.println("Day of the week is Friday");
        }

    }
}
