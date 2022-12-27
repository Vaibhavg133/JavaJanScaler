package com.codingProblemCodeChef;

public class firstAndLastDigit {
    public static void main(String[] args) {
        int number = 321;
        int lastDigit=number%10;
        int temp = number;
        int size=0;
        while(temp!=0)
        {
            size++;
            temp=temp/10;
        }
        int num=number;
        while(size!=1)
        {
            num=num/10;
            size--;
        }
        int out=lastDigit+num;
        System.out.println(out);
    }
}
