package com.HackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class grading {
    public static void main(String[] args) {
        int[] Array = {34};//{86,30,0,16,51,53,42,48,22,69,12,27,34,24,95,16,32,22,52,56,71,95};
        ArrayList<Integer> grades = arrayToList(Array);
//        Scanner sc = new Scanner(System.in);
//        for(int i=0;i<4;i++)
//        {
//            grades.add(sc.nextInt());
//        }
//        for(int i : grades)
//        {
//            System.out.print(i+" ");
//        }
        ArrayList<Integer> result = gradess(grades);
        for(int i : result)
        {
            System.out.print(i+" ");
        }

    }
    public static ArrayList<Integer> arrayToList(int[] A)
    {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i:A)
        {
            result.add(i);
        }
        return result;
    }

    public static ArrayList<Integer> gradess(ArrayList<Integer> gradess)
    {
        ArrayList<Integer> finalList = new ArrayList<>();
        for(int i=0;i<gradess.size();i++)
        {
            int mark = gradess.get(i);
            if(mark>39)
            {
                int roundedNumber = roundMaker5(mark);
                int difference = roundedNumber-mark;
                if(difference<3)
                {
                    finalList.add(roundedNumber);
                }
                else
                {
                    finalList.add(mark);
                }
            }
            else
            {
                finalList.add(mark);
            }
        }
        return finalList;
    }
    public static int roundMaker5(int Number)
    {
        int result=Number%5; //67 % 5 = 2
        int round = Number+(5-result); //67 + (5-2)
        return round;
    }



}
