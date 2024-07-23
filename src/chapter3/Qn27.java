package chapter3;

import java.util.Scanner;

public class Qn27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter (x,Y) points");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        if(x >= 0 && x <= 200 && y >= 0 && y <= 100 && y <= 100 - 0.5 * x){
            System.out.println("Points are in the triangle");
        } else {
            System.out.println("Points are not in the triangle");
        }
    }
}
