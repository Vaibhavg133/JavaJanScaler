package com.AdvancedBatch.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class perFectoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        System.out.println(solve(2));
    }
    public static String solve(int A)
    {
        Queue<String> myQueue = new LinkedList<>();
        myQueue.add("1");
        myQueue.add("2");
        StringBuilder mainString = new StringBuilder();
        while(A!=0)
        {
            String q =myQueue.poll();
            String q1 = q+"1";
            String q2 = q+"2";
            StringBuilder myString = new StringBuilder();
            myString.append(q);
            myString.append(reverse(q));
            //System.out.println(myString);
            if(A==1)
            {
                mainString.append(myString);
            }
            myQueue.add(q1);
            myQueue.add(q2);
            A--;
        }
        return mainString.toString();
    }
    public static String reverse(String a)
    {
        StringBuilder sb = new StringBuilder();
        for(int i=a.length()-1;i>=0;i--)
        {
            sb.append(a.charAt(i));
        }
        return sb.toString();
    }


}
