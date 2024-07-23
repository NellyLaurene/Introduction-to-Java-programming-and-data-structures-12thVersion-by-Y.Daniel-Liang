package chapter3;

import java.util.Scanner;

public class Qn28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the center x-, y-coordinates, width, and height of the 1st rectangle:");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double w1 = scanner.nextDouble();
        double h1 = scanner.nextDouble();

        System.out.println("Enter the center x-, y-coordinates, width, and height of the 2nd rectangle:");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double w2 = scanner.nextDouble();
        double h2 = scanner.nextDouble();

        double halfW1 = w1 / 2.0;
        double halfH1 = h1 / 2.0;
        double halfW2 = w2 / 2.0;
        double halfH2 = h2 / 2.0;

        double dx = Math.abs(x1 - x2);
        double dy = Math.abs(y1 - y2);

        if (dx <= (halfW1 + halfW2) && dy <= (halfH1 + halfH2)) {
            System.out.println("The rectangles overlap.");
        } else {
            System.out.println("The rectangles do not overlap.");
        }

        if (dx + halfW2 <= halfW1 && dy + halfH2 <= halfH1) {
            System.out.println("The second rectangle is inside the first rectangle.");
        } else if (dx + halfW1 <= halfW2 && dy + halfH1 <= halfH2) {
            System.out.println("The first rectangle is inside the second rectangle.");
        } else {
            System.out.println("Neither rectangle is completely inside the other.");
        }
    }
}
