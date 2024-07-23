package chapter3;

import java.util.Scanner;
public class Qn1 {
//    (Algebra: solve quadratic equations) The two roots of a quadratic equation
//    ax2 + bx + c = 0 can be obtained using the following formula:
//    r1 = -b + 2b2 - 4ac/2a
//    and r2 = -b - 2b2 - 4ac/2a
//    b2 - 4ac is called the discriminant of the quadratic equation. If it is positive, the
//    equation has two real roots. If it is zero, the equation has one root. If it is negative, the equation has no real roots.
//    Write a program that prompts the user to enter values for a, b, and c and displays
//    the result based on the discriminant. If the discriminant is positive, display two
//    roots. If the discriminant is 0, display one root. Otherwise, display “The equation
//    has no real roots.
//    Note you can use Math.pow(x, 0.5) to compute 2x

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 3 numbers");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double discriminant = Math.sqrt( Math.pow(b,2) - 4*a*c);
        double root1 = (-b + discriminant) / 2*a;
        double root2 = (-b - discriminant) / 2*a;

        if(discriminant > 0){
            System.out.println("There are 2 real roots: "+root1 +" "+root2);
        } else if (discriminant < 0) {
            System.out.println("There is one real root: "+root1);
        } else {
            System.out.println("There are not real roots");
        }

    }
}
