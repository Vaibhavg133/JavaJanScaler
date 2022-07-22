package com.codingProblemCodeChef;

import java.util.Scanner;

public class Volume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0;i<T;i++)
        {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int res = X-Y;
            if(res<0)
            {
                res=res*-1;
            }
            System.out.println(res);
        }
    }
}
