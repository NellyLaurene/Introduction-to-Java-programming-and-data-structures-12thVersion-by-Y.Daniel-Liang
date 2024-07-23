package chapter3;

import java.util.Scanner;

public class Qn15 {
//    Game: lottery) Revise Listing 3.8, Lottery.java, to generate a lottery of a threedigit integer.
//    The program prompts the user to enter a three-digit integer and
//    determines whether the user wins according to the following rules:
//            1. If the user input matches the lottery number in the exact order, the award is
//    $10,000.
//            2. If all digits in the user input match all digits in the lottery number, the award
//    is $3,000.
//            3. If one digit in the user input matches a digit in the lottery number, the award
//    is $1,000.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int random1 = (int)(Math.random()*10);
        int random2 = (int)(Math.random()*10);
        int random3 = (int)(Math.random()*10);
        System.out.println(random1+""+random2+""+random3);

        System.out.println("Enter 3 numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if(a==random1 && b==random2 && c==random3){
            System.out.println("Your award is $10,000");
        } else if ((a==random1 || a==random2 || a==random3) &&
                (b==random1 || b==random2 || b==random3) &&
                (c==random1 || c==random2 || c==random3)) {
            System.out.println("your award is $3,000");
        } else if (a==random1 || a==random2 || a==random3 ||
                   b==random1 || b==random2 || b==random3 ||
                   c==random1 || c==random2 || c==random3) {
            System.out.println("your award is $1,000");
        } else {
            System.out.println("Not a match");
        }

    }
}
