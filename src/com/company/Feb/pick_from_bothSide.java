package com.company.Feb;

public class pick_from_bothSide {
    public static void main(String[] args) {
        int[] A = {5,-2,3,1,2};
        int B = 3;
        int N = A.length;
        int[] suffix = new int[N+1];
        suffix[N]=0;
        suffix[N-1]=A[N-1];
        for(int i=N-2;i>=0;i--)
        {
            suffix[i]=A[i]+suffix[i+1];
        }
        for(int i=0;i<suffix.length;i++)
        {
            System.out.print(suffix[i]+" ");
        }
        int pref_sum=0;
        int ans=suffix[N-B];
        for(int i=0;i<B;i++)
        {
            pref_sum+=A[i];
            int suff_sum = suffix[N-B+(i+1)];
            ans=Math.max(ans,pref_sum+suff_sum);
        }
        System.out.println();
        System.out.println(ans);
    }
}
