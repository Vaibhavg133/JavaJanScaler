package com.company.carryForwardRevision;

public class minMaxSubarray {
    public static void main(String[] args) {
        //int[] A = {1,2,3,1,3,4,6,4,6,3};
        int[] A = {8,8,8,8,8,8,8};
        int count=bruteForce(A);
        System.out.println(count);
        int count2=optimized(A);
        System.out.println(count2);
    }
    public static int optimized(int[] A)
    {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<A.length;i++)
        {
            if(A[i]>=max)
            {
                max=A[i];
            }
            if(A[i]<=min)
            {
                min=A[i];
            }
        }
        int ans=A.length;
        int latestMin=-1;
        int latestMax=-1;
        for(int i=0;i<A.length;i++)
        {
            if(A[i]==max)
            {
                latestMax=i;
            }
            if(A[i]==min)
            {
                latestMin=i;
            }
            if(latestMax>-1 && latestMin>-1)
            {
                int res = latestMax-latestMin;
                if(res<0)
                {
                    res=res*-1;
                }
                res=res+1;
                ans=Math.min(ans,res);
            }
        }
        return ans;
    }

    public static int bruteForce(int[] A)
    {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i< A.length;i++)
        {
            if(A[i]>=max)
            {
                max=A[i];
            }
            if(A[i]<=min)
            {
                min=A[i];
            }
        }
        int ans = A.length;
        //System.out.println(max+" "+min);
        for(int i=0;i<A.length;i++)
        {
            if(A[i]==max)
            {
                for(int j=i;j<A.length;j++)
                {
                    if(A[j]==min)
                    {
                        ans=Math.min(ans,j-i+1);
                        break;
                    }
                }
            }
            else if(A[i]==min)
            {
                for(int j=i;j<A.length;j++)
                {
                    if(A[j]==max)
                    {
                        ans=Math.min(ans,j-i+1);
                        break;
                    }
                }
            }
        }
        //System.out.println(ans);
        return ans;
    }

}
