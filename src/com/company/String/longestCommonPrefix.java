package com.company.String;

public class longestCommonPrefix {
    public static void main(String[] args) {
        String[] str = {"abab", "ab", "abcd"};//{"abcdefgh", "aefghijk", "abcefgh"};
        String res = longestCommonPrefix(str);
        System.out.println(res);

    }
    public static String longestCommonPrefix(String[] A)
    {
        String ans = "";
        int minLen=Integer.MAX_VALUE;
        for(int i=0;i<A.length;i++)
        {
            minLen=Math.min(A[i].length(),minLen);
        }
        for(int i=0;i<minLen;i++)
        {
            boolean isQuali=true;
            char ch =A[0].charAt(i);
            for(int j=0;j<A.length;j++)
            {
                if(A[j].charAt(i)!=ch)
                {
                    isQuali=false;
                    break;
                }
            }
            if(isQuali)
            {
                ans=ans+ch;
            }
        }
        return ans;
    }

}
