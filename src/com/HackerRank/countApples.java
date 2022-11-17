package com.HackerRank;

public class countApples {
    public static void main(String[] args) {
        int[] apple = {2,3,-4};
        int[] oranges = {3,-2,-4};
        int[] result = countAppleandOranges(7,10,4,12,apple,oranges);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
    public static int[] countAppleandOranges(int s,int t, int a, int b, int[] apple, int[] oranges)
    {
        int[] result = new int[2];
        int countApple=0;
        int countOranges=0;
        for(int i=0;i<apple.length;i++)
        {
            // - indicates left therefore ignore
            if(apple[i]>=0)
            {
                int res = a+apple[i];
                if(res>=s && res<=t)
                {
                    countApple++;
                }
            }
        }
        result[0]=countApple;
        for(int i=0;i<oranges.length;i++)
        {
            // + indicates right therefore ignored
            if(oranges[i]<=0)
            {
                int res = b-(oranges[i]*-1);
                if(res<=t && res>=s)
                {
                    countOranges++;
                }
            }
        }
        result[1]=countOranges;
        return result;
    }

}
