package org.example;

import java.util.Scanner;

public class Assignment {
    public static void main(String[] args)
    {
        int i=0;
        for (i=0;i<=10;i++)
        {
            int N = 0;
            N= (int) Math.round(Math.random() * 5);
            System.out.println("Please enter a number between 0 to 5 : ");
            Scanner number= new Scanner(System.in);
            int x=number.nextInt();
            if (x==N) {
                System.out.println("Woohaa..You enter the correct number!!");
                System.out.println("The random number was: " + N);
                break;
            } else if (x>N) {
                System.out.println("Number is too large");
            }
            else
                System.out.println("Number is too small");
        }
    }
    }