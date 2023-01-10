package com.CodeChef.Starters._71;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class petStore {
    public static void main(String[] args) {
//        int[] A = {1,2,2,3};
//        ArrayList<Integer> res= inputList(A,2);
//        System.out.println(res.size());
//        for(int i :res)
//        {
//            System.out.print(i+" ");
//        }
//        System.out.println();
//        ArrayList<Integer> res2 = inputList2(A,4);
//        for(int i : res2)
//        {
//            System.out.print(i+" ");
//        }
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        while(testCase!=0)
        {
            int size=sc.nextInt();
            int[] A = new int[size];
            for(int i=0;i<size;i++)
            {
                A[i]=sc.nextInt();
            }
            int flag=0;
            for(int i=0;i<size;i++)
            {
                ArrayList<Integer> setA = inputList(A,i);
                //setA = input(setA,i);
                ArrayList<Integer> setB = inputList2(A,size-i);//new ArrayList<>();
                for(int a : setA)
                {
                    System.out.print(a+" ");
                }
                System.out.println();
                for(int a : setB)
                {
                    System.out.print(a+" ");
                }
                //setB = input(setA,size-i);
//                if(setA.size()==setB.size())
//                {
//                    HashSet<Integer> myHash = new HashSet<>();
//                    for(int a : setA)
//                    {
//                        myHash.add(a);
//                    }
//                    int sizeA = myHash.size();
//                    for(int a : setB)
//                    {
//                        myHash.add(a);
//                    }
//                    int sizeB = myHash.size();
//                    if(sizeA==sizeB)
//                    {
//                       flag=1;
//                       break;
//                    }
//                }
//                if(flag==1)
//                {
//                    break;
//                }
            }
//            if(flag==1)
//            {
//                System.out.println("YES");
//            }
//            else
//            {
//                System.out.println("NO");
//            }
            testCase--;
        }
    }
    public static ArrayList<Integer> inputList2(int[] A,int element)
    {
        ArrayList<Integer> result =new ArrayList<>();
        if(A.length>=element)
        {
            return result;
        }
        for(int i=element;i<A.length;i++)
        {
            result.add(A[i]);
        }
        return result;
    }

    public static ArrayList<Integer> inputList(int[] A,int element)
    {
        ArrayList<Integer> result = new ArrayList<>();
        if(element<=0)
        {
            return result;
        }
        for(int i=0;i<element;i++)
        {
            result.add(A[i]);
        }
        return result;
    }

    public static ArrayList<Integer> input(ArrayList<Integer> myList, int start)
    {
        ArrayList<Integer> result = new ArrayList<>();
        if(start==0)
        {
            return result;
        }
        for(int i=0;i<start+1;i++)
        {
            result.add(myList.get(i));
        }
        return result;
    }
    public static ArrayList<Integer> inputRemaining(ArrayList<Integer> myList,int start)
    {
        ArrayList<Integer> result = new ArrayList<>();
        if(start==myList.size())
        {
            return result;
        }
        for(int i=start;i<myList.size();i++)
        {
            result.add(myList.get(i));
        }
        return result;
    }


}
