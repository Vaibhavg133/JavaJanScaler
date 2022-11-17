package com.AdvancedBatch.TwoPointer;

public class subArraySum {
    public static void main(String[] args) {
        int[] A = {1,2,3,4,5};//{1,1000000000};//{1,2,3,4,5};//{23, 50, 44, 6, 39, 15, 44, 27, 47, 29, 30, 44, 28, 42, 7, 32, 16, 40, 8, 7, 5, 48, 48, 16, 9, 5, 50, 16, 18, 9, 21, 26, 48, 37, 27, 7, 5, 29, 24, 28, 10, 44, 21, 1, 48, 15, 31, 41, 42, 23, 4, 32, 40, 40, 27, 20, 29, 42, 25, 18, 37, 43, 13, 30, 42, 24, 17, 42, 14, 42, 43, 36, 31, 29, 24, 24, 8, 3, 12, 34, 14, 6 };//{1,2,3,4,5};
        //{5,10,20,100,105};//{1, 2, 3, 4, 5};
        int B = 5;//1000000000;//110;
        int[] res = myFunc2ptimized(A,B);
        //sumOfSubarraysBF(A);
        //System.out.println();
        //sumSubPS(A);
        //int[] ans = myFunc(A,B); //bruteFoce
        //int[] res =myFuncPS(A,B);
        for(int  i : res)
        {
            System.out.print(i+" ");
        }

    }
    public static int[] myFunc2ptimized(int[] A,int B)
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
            }                               // [1,2,3,4,5]
        }                                   // [1,3,6,10,15]
        int left=0;
        int right=0;
        int flag=0;
        while(left<A.length && right<A.length)
        {
            int sum=0;
            if(left==0 && right==0)
            {
                sum=PS[left];
            }
            else if(left==0 && right!=0)
            {
                sum=PS[right];
            }
            else if(left!=0 && right!=0)
            {
                sum=PS[right]-PS[left-1];
            }
            if(sum==B)
            {
                flag=1;
                break;
            }
            else if(sum>B)
            {
                left++;
            }
            else
            {
                right++;
            }
        }
        int[] ans;
        if(flag==1)
        {
            ans = new int[right - left + 1];
            int counter=0;
            for(int i=left;i<=right;i++)
            {
                ans[counter]=A[i];
                counter++;
            }
        }
        else {
            ans = new int[]{-1};
        }
        return ans;
    }

    public static int[] myFunc2(int[] A, int B)
    {
        int left=0;
        int right=0;
        int flag=0;
        while(left<A.length && right<A.length)
        {
            int sum=0;
            for(int i=left;i<=right;i++)
            {
                sum+=A[i];
            }
            if(sum==B)
            {
                flag=1;
                break;
            }
            else if(sum>B)
            {
                left++;
            }
            else
            {
                right++;
            }
        }
        if(flag==1)
        {
            int[] result = new int[right-left+1];
            int counter=0;
            for(int a = left;a<=right;a++)
            {
                result[counter]=A[a];
                counter++;
            }
            return result;
        }
        else
        {
            int[] result = {-1};
            return result;
        }
    }

    public static void twoPointer(int[] A)
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
        int i=0;
        int j= A.length-1;
        while(i<j)
        {
            int sum=0;
            if(i==0)
            {
                sum=PS[j];
            }
            else if(j==A.length-1)
            {
                sum=PS[j];
            }
            else
            {
                sum=PS[j]-PS[i-1];
            }
            System.out.print(sum+" ");
            i++;
            j--;
        }
    }

    public static void sumOfSubarraysBF(int[] A)
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
                System.out.print(sum+" ");
            }
        }
    }
    public static void sumSubPS(int[] A)
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
        for(int i=0;i<A.length;i++)
        {
            for(int j=i;j<A.length;j++)
            {
                int sum=0;
                if(i==0)
                {
                    sum=PS[j];
                }
                else if(i==A.length)
                {
                    sum=PS[j];
                }
                else
                {
                    sum=PS[j]-PS[i-1];
                }
                System.out.print(sum+" ");
            }
        }
    }

    public static int[] myFunc(int[] A,int B)
    {
        int[] ans = new int[2];
        for(int i=0;i<A.length;i++)
        {
            for(int j=i;j<A.length;j++)
            {
                int sum=0;
                for(int k=i;k<=j;k++)
                {
                    sum=sum+A[k];
                }
                if(sum==B)
                {
                    ans[0]=i+1;
                    ans[1]=j+1;
                    return ans;
                }
            }
        }
        int[] failed = {-1};
        return failed;
    }
    public static int[] myFuncPS(int[] A, int B)
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
        for(int i=0;i<A.length;i++)
        {
            for(int j=i;j<A.length;j++)
            {
                int sum=0;
                if(i==0)
                {
                    sum=PS[j];
                }
                else if(i==A.length)
                {
                    sum=PS[j];
                }
                else {
                    sum = PS[j] - PS[i - 1];
                }
                if(sum==B)
                {
                    int[] r = new int[j-i+1];
                    int counter=0;
                    for(int a=i;a<=j;a++)
                    {
                        r[counter]=A[a];
                        counter++;
                    }
                    return r;
                }
            }
        }
        int[] res = {-1};
        //System.out.println("NOne");
        return res;
        //return res;
    }



}
