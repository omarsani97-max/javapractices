package org.example;

import java.util.Scanner;

public class ifelse_condition {
    public static void main(String[] args) {
        Scanner inputAmount= new Scanner(System.in);
        System.out.println("Enter amout: ");
        int cashAmount= inputAmount.nextInt();
        if (cashAmount>=50 && cashAmount<100){
            System.out.println("You get an ice-cream");
        }
        else if (cashAmount>=100 || cashAmount>110) {
            System.out.println("You are suitable for two or more ice_cream");
        } else {
            System.out.println("Need more money to get an ice-cream");
        }

    }
}
