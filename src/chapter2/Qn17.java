package chapter2;

import java.util.Scanner;
public class Qn17 {
//    (Science: wind-chill temperature) How cold is it outside? The temperature alone is
//    not enough to provide the answer. Other factors including wind speed, relative humidity,
//    and sunshine play important roles in determining coldness outside. In 2001,
//    the National Weather Service (NWS) implemented the new wind-chill temperature
//    to measure the coldness using temperature and wind speed. The formula is
//            twc = 35.74 + 0.6215ta - 35.75v^0.16 + 0.4275tav^0.16
//    where ta is the outside temperature measured in degrees Fahrenheit, v is the speed
//    measured in miles per hour, and twc is the wind-chill temperature. The formula cannot
//    be used for wind speeds below 2 mph or temperatures below -58°F or above 41°F.
//    Write a program that prompts the user to enter a temperature between -58°F
//    and 41°F and a wind speed greater than or equal to 2 then displays the wind-chill
//    temperature. Use Math.pow(a, b) to compute v0.16.

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the temperature between -58  and 41 degree Fahrenheit ");
        double t = scanner.nextDouble();
        System.out.println("Enter the the wind speed greater than or equal to 2 in miles per hour: ");
        double v = scanner.nextDouble();

        double windChill = 35.74 + (0.6215*t) - (35.75 * Math.pow(v,0.16)) + ((0.4275 *t)*Math.pow(v,0.16));
        System.out.println("The wind chillness outside is: "+windChill);
    }
}
