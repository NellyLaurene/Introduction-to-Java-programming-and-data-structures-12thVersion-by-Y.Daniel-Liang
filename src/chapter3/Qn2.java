package chapter3;

import java.util.Scanner;
public class Qn2 {
//    Game: add three numbers) The program in Listing 3.1, AdditionQuiz.java, generates
//    two integers and prompts the user to enter the sum of these two integers.
//    Revise the program to generate three single-digit integers and prompt the user to
//    enter the sum of these three integers.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = (int) (Math.random() * 10);
        int num2 = (int)(Math.random() * 10);
        int num3 = (int)(Math.random() * 10);
        int answer = num1 + num2 + num3;

        System.out.println("What is "+num1+" + "+num2+" + "+num3+" = ");
        int userAnswer = scanner.nextInt();

        if(userAnswer == answer){
            System.out.println("Correct");
        }else {
            System.out.println("Not correct");
        }
    }
}
