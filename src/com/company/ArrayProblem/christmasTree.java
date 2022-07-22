package com.company.ArrayProblem;

public class christmasTree {
    public static void main(String[] args) {
        int[] A = {5,9,10,4,7,8};//{1,6,4,2,6,9};
        int[] B = {5,6,4,7,2,5};//{2,5,7,3,2,7};
        int ans = bruteForce(A,B);
        System.out.println(ans);
        int ans2=optimized2(A,B);
        System.out.println(ans2);

    }
    public static int optimized2(int[] A,int[] B)
    {
        int ans = Integer.MAX_VALUE;
        for(int j=1;j<A.length-1;j++)
        {
            int val_i = Integer.MAX_VALUE;
            int val_k = Integer.MAX_VALUE;
            int tempSum = B[j];
            for(int i=j-1;i>=0;i--)
            {
                if(A[i]<A[j])
                {
                    val_i=Math.min(B[i],val_i);
                }
            }
            for(int k=j+1;k<A.length;k++)
            {
                if(A[k]>A[j])
                {
                    val_k=Math.min(B[k],val_k);
                }
            }
            if(val_i!=Integer.MAX_VALUE && val_k!=Integer.MAX_VALUE)
            {
                tempSum=tempSum+(val_i+val_k);
                ans=Math.min(tempSum,ans);
            }
        }
        if(ans==Integer.MAX_VALUE)
        {
            return -1;
        }
        else
        {
            return ans;
        }
    }

    public static int optimized(int[] A, int[] B)
    {
        int ans = Integer.MAX_VALUE;
        int val_i = Integer.MAX_VALUE;
        int val_k = Integer.MAX_VALUE;
        for(int j=1;j<A.length-1;j++)
        {
            int tempSum=B[j];
//            int val_i = Integer.MAX_VALUE;
//           int val_k = Integer.MAX_VALUE;
            for(int i=j-1;i>=1;i--)
            {
                if(A[i]<A[j])
                {
  //                  val_i=B[i];
                  val_i = Math.min(B[i],val_i);
                }
            }
            for(int k=j+1;k<A.length;k++)
            {
                if(A[k]>A[j])
                {
//                   val_k=B[k];
                  val_k=Math.min(B[k],val_k);
                }
            }
            if(val_i!=Integer.MAX_VALUE && val_k!=Integer.MAX_VALUE)
            {
                tempSum=tempSum+(val_i+val_k);
                ans=Math.min(ans,tempSum);
            }
        }
        if(ans==Integer.MAX_VALUE)
        {
            return -1;
        }
        else
        {
            return ans;
        }
    }

    public static int bruteForce(int[] A,int[] B)
    {
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<A.length;i++)
        {
            for(int j=i+1;j<A.length;j++)
            {
                for(int k=j+1;k<A.length;k++)
                {
                    if(A[k]>A[j] && A[j]>A[i])
                    {
                        int sum=0;
                        sum=B[i]+B[j]+B[k];
                        ans=Math.min(sum,ans);
                    }
                }
            }
        }
        //System.out.println(ans);
        return ans;
    }

}
