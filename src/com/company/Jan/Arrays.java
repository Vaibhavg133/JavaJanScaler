package com.company.Jan;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> rev = new ArrayList<>();
        BufferedReader br =new BufferedReader(new InputStreamReader((System.in)));
//        int N=sc.nextInt();
//        int[] array = new int[N];
//        int[] arr={10,20,30,40,50};
//        int leng=arr.length;
//        System.out.println(leng);
//        for(int i=0;i<N;i++)
//        {
//            array[i]=sc.nextInt();
//        }
//        for(int i=N-1;i>=0;i--)
//        {
//            System.out.print(array[i]+" ");
//        }
        String name = sc.nextLine();
        System.out.println(name);
        String output="";
        for(int i=name.length()-1;i>=0;i--)
        {
            output+=name.charAt(i);
            //System.out.print(name.charAt(i)+" ");
        }
        System.out.println(output);
        if(name.equals(output))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}

