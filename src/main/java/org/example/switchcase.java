package org.example;

import java.text.BreakIterator;
import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please you weekly day number: ");
         int day=input.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Input number is not okay");
        }


    }
}
