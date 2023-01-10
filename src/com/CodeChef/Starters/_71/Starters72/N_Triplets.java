package com.CodeChef.Starters._71.Starters72;

import java.util.HashSet;
import java.util.Scanner;

public class N_Triplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        while(testCase!=0)
        {
            int res = sc.nextInt();
            optimized3(res);
            //bruteForce(res);
            //optimized2(res);
            testCase--;
        }
    }
    public static void optimized3(int Number)
    {
        int flag=0;
        for(int i=2;i<=Number;i++)
        {
            int myNumber = i;
            int[] func = optimized2(Number/myNumber);
            if(myNumber!=func[0] && myNumber!=func[1] && func[0]!=0 && func[1]!=0)
            {
                System.out.println(i+" "+func[0]+" "+func[1]);
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println(-1);
        }
    }

    public static int[] optimized2(int Number)
    {
        int[] res = new int[2];
        HashSet<Integer> set = new HashSet<>();
        for(int i=2;i<=Number;i++)
        {
            set.add(i);
        }
        for(int i=2;i<=Number;i++)
        {
            int number = Number%i;
            if(Number%i==0 && set.contains(Number/i))
            {
                res[0]=i;
                res[1]=Number/i;
                if(res[0]!=res[1])
                {
                    //continue;
                    return res;
                }
                //System.out.println(i+" "+Number/i);
            }
        }
        res[0]=0;
        res[1]=0;
        return res;
    }


    public static void bruteForce(int Number)
    {
        int number = Number;
        int flag=0;
        for(int i=2;i<number;i++)
        {
            for(int j=i+1;j<number;j++)
            {
                for(int k=j+1;j<number;k++)
                {
                    if(((i*j)%number==0) || ((j*k)%number==0) || ((i*k)%number==0) && ((i*j*k)%number==0))
                    {
                        flag=1;
                        System.out.println(i+" "+j+" "+k);
                        break;

                    }

                }
                if(flag==1)
                {
                    break;
                }
            }
            if(flag==1)
            {
                break;
            }
        }
        if(flag==0)
        {
            System.out.println(-1);
        }
    }
    public static void optimized(int Number)
    {
        HashSet<Integer> set = new HashSet<>();
        for(int i=2;i<=Number;i++)
        {
            set.add(i);
        }
        HashSet<Integer> set2 = new HashSet<>();
        for(int i=2;i<=Number;i++)
        {
            int number = Number/i;
            if(set.contains(number))
            {
                //set2.add(Number-i);
                if(i*number==Number)
                {
                    System.out.println(i+" "+number);
                }
//                System.out.println(i+" "+(number));
            }
        }
    }


}
