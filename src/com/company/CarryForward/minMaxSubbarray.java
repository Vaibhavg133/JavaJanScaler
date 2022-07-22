package com.company.CarryForward;

public class minMaxSubbarray {
    public static void main(String[] args) {
        int[] A = {1,6,4,2,7,7,5,1,3,1,1,5};
        //int[] A = {8,8,8,8,8,8};
        int res = bruteForce(A);
        System.out.println(res);
        int res2=optimize(A);
        System.out.println(res2);

    }
    public static int optimize(int[] A)
    {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<A.length;i++)
        {
            if(A[i]>=max)
            {
                max=A[i];
            }
            else if(A[i]<=min)
            {
                min=A[i];
            }
        }
        int latestMin=-1;
        int latestMax=-1;
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<A.length;i++) {
            if (A[i] == max) {
                latestMax = i;
            } else if (A[i] == min) {
                latestMin = i;
            }
            if (latestMax > -1 && latestMin > -1) {
                int res = latestMax - latestMin;
                if (res < 0) {
                    res = res * -1;
                }
                res = res+1;
                ans = Math.min(ans, res);
            }
        }
        return ans;
    }

    public static int bruteForce(int[] A)
    {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
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
  //      System.out.println(max+" "+min);
        int ans=Integer.MAX_VALUE;
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
//        System.out.println(ans);
        return ans;
    }

}
