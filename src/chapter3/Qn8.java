package chapter3;

import java.util.Scanner;

public class Qn8 {
//     (Sort three integers) Write a program that prompts the user to enter three integers
//    and display the integers in non-decreasing order
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 3 numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int temp = 0;

        if(a > b){
            temp = a;
            a = b;
            b = temp;
        }
        if(a > c){
            temp = a;
            a = c;
            c = temp;
        }
        if(b > c){
            temp = b;
            b = c;
            c = temp;
        }
        System.out.println(a+","+b+","+c);
    }
}
