package chapter3;

import java.util.Scanner;

public class Qn22 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter (x,Y) points");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int distance = (int)Math.sqrt(Math.pow(x,2) + Math.pow(y,2));

        if(distance <= 10){
            System.out.println("Points are in the circle");
        } else {
            System.out.println("Points are not in the circle");
        }
    }
}
