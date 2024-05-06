/*
 * Jayden Fitts
 * 530003798
 * CSCE111 - 502
 * 3/29/2024
 */

import java.util.Scanner;

public class CalcDriver {
    public static void main(String[] args) {
        System.out.println("Welcome to the String Calculator");
        Scanner scnr = new Scanner(System.in);
        
        System.out.println("Enter Your First Number:");
        String num1 = scnr.next();

        System.out.println("Enter Your Second Number:");
        String num2 = scnr.next();

        System.out.println("Sum: " + Calc.add(num1, num2));
    }
 }
