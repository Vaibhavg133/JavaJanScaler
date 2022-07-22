package com.codingProblemCodeChef;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double amountWithdrawn = sc.nextFloat();
        double amountAvailable = sc.nextFloat();
        if((amountWithdrawn-0.5)<amountAvailable)
        {
            if(amountWithdrawn%5==0)
            {
                amountAvailable=amountAvailable-amountWithdrawn-0.5;
                System.out.println(String.format("%.2f",amountAvailable));
            }
            else
            {
                System.out.println(String.format("%.2f",amountAvailable));
            }
        }
        else
        {
            System.out.println(String.format("%.2f",amountAvailable));
        }
    }
}
