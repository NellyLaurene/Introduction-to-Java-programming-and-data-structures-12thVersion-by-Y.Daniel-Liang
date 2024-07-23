package chapter3;

import java.util.Scanner;

public class Qn6 {
//     (Health application: BMI) Revise Listing 3.4, ComputeAndInterpretBMI.java, to
//    let the user enter weight, feet, and inches. For example, if a person is 5 feet and
//10 inches, you will enter 5 for feet and 10 for inches.
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your weight in pounds: ");
        int weight = scanner.nextInt();
        System.out.println("Enter your height feet: ");
        int feet = scanner.nextInt();
        System.out.println("Enter the inches: ");
        int inches = scanner.nextInt();

        int height = (feet * 12) + inches;
        double bmi = weight*703 / (Math.pow(height,2));

        if(bmi < 18.5){
            System.out.println(bmi+"Underweight");

        }else if(bmi > 18.5 && bmi < 24.9){
            System.out.println(bmi+"Normal");
        } else {
            System.out.println(bmi+"Overweight");
        }

    }
}
