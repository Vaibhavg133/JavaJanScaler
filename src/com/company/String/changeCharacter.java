package com.company.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class changeCharacter {
    public static int solve(String A, int N)
    {
        int[] characterFrequencyArray = new int[26];
        int ans =0;
        for(int i=0;i<A.length();i++)
        {
            characterFrequencyArray[A.charAt(i)-'a']++;
            if(characterFrequencyArray[A.charAt(i)-'a']==1)
            {
                ans++;
            }
        }
        System.out.println();
        for(int i=0;i<characterFrequencyArray.length;i++)
        {
            System.out.print(characterFrequencyArray[i]+" ");
        }
        Arrays.sort(characterFrequencyArray);
        System.out.println();
        for(int i=0;i<characterFrequencyArray.length;i++)
        {
            System.out.print(characterFrequencyArray[i]+" ");
        }
        System.out.println();
        System.out.println(ans);
        return 0;
    }
    public static int Solve(String A, int N)
    {
        int[] cnt = new int[26];
        for(int i=0;i<A.length();i++)
        {
            cnt[A.charAt(i)-'a']++;
        }
        ArrayList<Integer> C = new ArrayList<>();
        for(int i=0;i< cnt.length;i++)
        {
            if(cnt[i]>0)
            {
                C.add(cnt[i]);
            }
        }
        Collections.sort(C);
        for(int i=0;i<C.size();i++)
        {
            N = N-C.get(i);
            if(N<0)
            {
                return C.size()-i;
            }
        }
        return 1;
    }


    public static void main(String[] args) {
        String A = "abcabbccd";
        int N = 3;
        System.out.println(A);
        int res = Solve(A,N);
        System.out.println();
        System.out.println(res);
    }
}
