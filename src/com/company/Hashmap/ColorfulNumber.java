package com.company.Hashmap;

import java.util.*;

public class ColorfulNumber {
    public static void main(String[] args) {
        int A = 23;
        ArrayList<Integer> numberarray = new ArrayList<>();
        while(A!=0)
        {
            int digit = A%10;
            numberarray.add(digit);
            A=A/10;
        }
        ArrayList<Integer> number2 = new ArrayList<>();
        for(int i=numberarray.size()-1;i>=0;i--)
        {
            number2.add(numberarray.get(i));
        }

        for(int i=0;i<numberarray.size();i++)
        {
            System.out.print(numberarray.get(i)+" ");
        }
        for(int i=0;i<number2.size();i++)
        {
            System.out.print(number2.get(i)+" ");
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<number2.size();i++)
        {
            int prod = 1;
            for(int j=i;j<number2.size();j++)
            {
                prod=prod*number2.get(j);
                if(set.contains(prod))
                {
                    System.out.println();
                }
                else {
                    set.add(prod);
                }
            }
        }
        System.out.println();

    }
}
