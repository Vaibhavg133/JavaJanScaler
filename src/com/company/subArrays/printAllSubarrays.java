package com.company.subArrays;

public class printAllSubarrays {
    public static void main(String[] args) {
        int[] A = {1,2,3};
//        printAllSubarray(A)//      System.out.println();
        printAllSubarrays(A);
        System.out.println();
        sumSubArray(A);
        System.out.println();
        int res = sumOpti(A);
        System.out.println(res);
        sumOptiTwo(A);
        System.out.println();
        sumOptiThree(A);
        System.out.println();
//        subArraySumBruteForce(A);
//        System.out.println();
//        subArraySumOptimized(A);
//        System.out.println();
//        sumofAllSumSubarrays(A);
//        System.out.println();
//        sumOfAllSumSubarraysOP(A);
//        System.out.println();
//        subArraySumOptimizedTwo(A);
//        System.out.println();
//        deepakSirSol(A);
//        System.out.println();
//        sumOptimizedOn(A);

    }
    public static void sumOptiThree(int[] A)
    {
        int sum=0;
        for(int i=0;i<A.length;i++)
        {
            int s = i+1;
            int e = A.length-i;
            int fre = s*e;
            int res = fre * A[i];
            sum+=res;
        }
        System.out.println(sum);
    }
    public static void sumOptiTwo(int[] A)
    {
        int masterSum=0;
        for(int i=0;i<A.length;i++)
        {
            int sum=0;
            for(int j=i;j<A.length;j++)
            {
                sum+=A[j];
                masterSum+=sum;
            }
        }
        System.out.println(masterSum);
    }

    public static int sumOpti(int[] A)
    {
        int[] PS = new int[A.length];
        for(int i=0;i<A.length;i++)
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
        int mastersum=0;
        for(int i=0;i<A.length;i++)
        {
            for(int j=i;j<A.length;j++)
            {
                int sum=0;
                if(i==0)
                {
                    sum=PS[j];
                }
                else
                {
                    sum=PS[j]-PS[i-1];
                }
//                System.out.println(sum);
                mastersum+=sum;
            }
        }
        return mastersum;
    }
    public static void sumSubArray(int[] A)
    {
        for(int i=0;i<A.length;i++)
        {
            for(int j=i;j<A.length;j++)
            {
                int sum=0;
                for(int k=i;k<=j;k++)
                {
                    sum+=A[k];
                }
                System.out.println(sum);
            }
        }
    }
    public static void printAllSubarrays(int[] A)
    {
        for(int i=0;i<A.length;i++)
        {
            for(int j=i;j<A.length;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    System.out.print(A[k]+" ");
                }
                System.out.println();
            }
        }
    }

    public static void sumOptimizedOn(int[] A)
    {
        int master_sum=0;
        for(int i=0;i<A.length;i++)
        {
            int s = i+1;
            int e = A.length-i;
            int freq = s*e;
            int sum = freq * A[i];
            master_sum+=sum;
        }
        System.out.println(master_sum);
    }

    public static void deepakSirSol(int[] A)
    {
        //sum=0;
        int master_sum=0;
        for(int s=0;s<A.length;s++)
        {
            int sum=0;
            for(int e=s;e<A.length;e++)
            {
                sum+=A[e];
                master_sum+=sum;
                //System.out.print(sum+" ");
            }
        }
        System.out.println(master_sum)  ;
        //System.out.println(sum);
    }

    public static void sumOfAllSumSubarraysOP(int[] A)
    {
        int[] PS = new int[A.length];
        for(int i=0;i<A.length;i++)
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
        int master_sum=0;
        for(int s=0;s<A.length;s++)
        {
            for(int e=s;e<A.length;e++)
            {
                int sum=0;
                if(s==0)
                {
                    sum=PS[e];
                }
                else
                {
                    sum = PS[e]-PS[s-1];
                }
                master_sum+=sum;
            }
        }
        System.out.println(master_sum);
    }

    public static void sumofAllSumSubarrays(int[] A)
    {
        int master_sum=0;
        for(int s=0;s<A.length;s++)
        {
            int sum = 0;
            for(int e=s;e<A.length;e++)
            {
                master_sum+=A[e];
            }
            //System.out.print(sum+" ");
            //master_sum+=sum;
        }
        System.out.println(master_sum);
    }
    public static void subArraySumOptimizedTwo(int[] A)
    {
        for(int s=0;s<A.length;s++)
        {
            int sum=0;
            for(int e=s;e<A.length;e++)
            {
                sum+=A[e];
            }
            System.out.print(sum+" ");

        }
    }

    public static void subArraySumOptimized(int[] A)
    {
        int[] PS = new int[A.length];
        for(int i=0;i<A.length;i++)
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
        for(int s=0;s<A.length;s++)
        {
            for(int e=s;e<A.length;e++)
            {
                int sum=0;
                if(s==0)
                {
                    sum=PS[e];
                }
                else
                {
                    sum = PS[e]-PS[s-1];
                }
                System.out.print(sum+" ");
            }
        }
    }

    public static void subArraySumBruteForce(int[] A)
    {
        for(int i=0;i<A.length;i++)
        {
            for(int j=i;j< A.length;j++)
            {
                int sum=0;
                for(int k=i;k<=j;k++)
                {
                    sum+=A[k];
                }
                System.out.print(sum+" ");
            }
        }
    }

    public static void printAllSubarray(int[] A)
    {
        for(int i=0;i<A.length;i++)
        {
            for(int j=i;j<A.length;j++)
            {
                printSubArray(A,i,j);
                System.out.println();
            }
        }
    }
    public static void printSubArray(int[] A, int s, int e)
    {
        for(int i=s;i<=e;i++)
        {
            System.out.print(A[i]+" ");
        }
    }

}
