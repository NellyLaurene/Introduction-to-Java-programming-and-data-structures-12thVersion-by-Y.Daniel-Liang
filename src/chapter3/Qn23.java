package chapter3;

import java.util.Scanner;

public class Qn23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter (x,Y) points");
        double w = scanner.nextDouble();
        double h = scanner.nextDouble();

        if (Math.abs(w) <= 10 / 2.0 && Math.abs(h) <= 5 / 2.0) {
            System.out.println("It is in the rectangle");
        } else {
            System.out.println("It is not in the rectangle");
        }
    }
}
