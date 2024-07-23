package chapter3;

import java.util.Scanner;

public class Qn3 {
// (Algebra: solve 2 * 2 linear equations) A linear equation can be solved using
//    Cramer’s rule given in Programming Exercise 1.13. Write a program that prompts
//    the user to enter a, b, c, d, e, and f and displays the result. If ad - bc is 0, report
//    that “The equation has no solution.”
//    ax + by = e
//    cx + dy = f
//            x = (ed - bf)/(ad - bc)
//            y = (af - ec)/(ad - bc)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write 6 numbers here: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        int f = scanner.nextInt();

        int x = x = (e*d - b*f)/(a*d - b*c);
       int y = (a*f - e*c)/(a*d - b*c);

        int check = (a*d)-(d*c);
        if(check == 0) {
            System.out.println("The equation has no solution.");
        } else {
            System.out.println("X= "+x);
            System.out.println("Y= "+y);
        }
    }
}
