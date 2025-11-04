package org.example;

import com.sun.source.doctree.SummaryTree;

import java.util.Scanner;

public class Scannerclass {
    public static void main(String[] args) {
        System.out.println("Enter 1st number: ");
        Scanner Numberx= new Scanner(System.in);
        Integer number1= Numberx.nextInt();
        System.out.println("Enter 2nd Number: ");
        Integer number2= Numberx.nextInt();
        System.out.println("Summation of number is: "+ Math.addExact(number1,number2));

    }
}
