package com.company.Hashmap;

import java.util.ArrayList;
import java.util.HashMap;

public class largestContinuousZero {
    public static void main(String[] args) {
        int[] A = {1,2,-2,4,-4};
        HashMap<Integer,Integer> map = new HashMap<>();
        int max=Integer.MIN_VALUE;
        int sum=0;
        int start=0,end=-1;
        for(int i=0;i<A.length;i++)
        {
            sum+=A[i];
            if(sum==0)
            {
                int len = i;
                max=Math.max(max,len);
                if(len==max)
                {
                    start=0;
                    end=i;
                }
            }
            if(map.containsKey(sum)==false)
            {
                map.put(i,sum);
            }
            else
            {
                int len = i-map.get(sum);
                max = Math.max(len,max);
                if(len==max)
                {
                    end=len;
                    start=len-i;
                }
            }
        }
        System.out.println(start+" "+end);
        //HashMap<Long, Long>
    }
    /*
    int res = 0;//Integer.MIN_VALUE;
        for(int i=0;i<C.length;i++)
        {
            int sum=0;
            for(int j=i;j<C.length;j++)
            {
                sum+=C[j];
                if(sum<=B)
                {
                    res = Math.max(sum,res);
                }
                else
                {
                    break;
                }
            }
        }
        return res;
    */
    public static void printList(ArrayList<Integer> A)
    {
        for(int i=0;i<A.size();i++)
        {
            System.out.print(A.get(i)+" ");
        }
    }
    public static ArrayList<Integer> optimized(int[] A)
    {
        ArrayList<Integer> resr = new ArrayList<>();
        int max = 0;
        int start = 0;
        int end = -1;
        for(int i=0;i<A.length;i++)
        {
            int sum=0;
            for(int j=i;j<A.length;j++)
            {
                sum=sum+A[i];
                if(sum==0)
                {
                    max=Math.max(sum,max);
                    if(sum==max)
                    {
                        start=i;
                        end=j;
                    }
                }
            }
        }
        for(int i=start;i<=end;i++)
        {
            resr.add(A[i]);
        }
        return resr;
    }
    public static ArrayList<Integer> prefixSum(int[] A)
    {
        int max = Integer.MIN_VALUE;
        int start=0;
        int end=-1;
        ArrayList<Integer> result = new ArrayList<>();
        int[] PS = new int[A.length];
        for(int i=0;i<PS.length;i++)
        {
            if(i==0)
            {
                PS[i]=A[i];
            }
            else
            {
                PS[i]=PS[i-1]+A[i];
            }
        }
        for(int i=0;i<A.length;i++)
        {
            for(int j=i;i<A.length;i++)
            {
                //sum = 0;
                if(i==0)
                {
                    int sum=PS[j];
                    if(sum==0)
                    {
                        int countLen = j-i+1;
                        max=Math.max(max,countLen);
                        if(max==countLen)
                        {
                            start=i;
                            end=j;
                        }
                    }
                }
                else
                {
                    int sum=PS[j]-PS[i-1];
                    if(sum==0)
                    {
                        int countLen = j-i+1;
                        max=Math.max(max,countLen);
                        if(max==countLen)
                        {
                            start=i;
                            end=j;
                        }
                    }
                }

            }
        }
        for(int i=start;i<=end;i++)
        {
            result.add(A[i]);
        }
        return result;
    }
    public static ArrayList<Integer> bruteForce(int[] A)
    {
        int max = Integer.MIN_VALUE;
        int start=0;int end=-1;
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0;i<A.length;i++)
        {
            for(int j=i;j<A.length;j++)
            {
                int sum=0;
                for(int k=i;k<=j;k++)
                {
                    sum+=A[k];
                }
                if(sum==0)
                {
                    int countLen = j-i+1;
                    max=Math.max(max,countLen);
                    if(max==countLen)
                    {
                        start=i;
                        end=j;
                    }
                }
            }
        }
        //System.out.println("Start "+start+" & End "+end);
        ArrayList<Integer> resr = new ArrayList<>();
        for(int i=start;i<=end;i++)
        {
            resr.add(A[i]);
        }
        return resr;
    }

}
