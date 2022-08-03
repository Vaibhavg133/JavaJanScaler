package com.company.Hashmap;

import java.util.ArrayList;
import java.util.HashMap;

public class alienLanguage {
    public static void main(String[] args) {
        String[] a = {"fine", "none", "no"};//{"hello","scaler","interviewbit"};
        ArrayList<String> A = convert(a);
        String B = "";//"qwertyuiopasdfghjklzxcvbnm";//"adhbcfegskjlponmirqtxwuvzy";
        int ans = solve2(A,B);
        System.out.println(ans);

    }
    public static int solve2(ArrayList<String> A, String B)
    {
        int[] mapping = new int[26];
        int seq = 0;
        for(char ch : B.toCharArray())
        {
            mapping[ch-'a']=seq++;
        }
        for(int i=0;i<A.size()-1;i++)
        {
            String current = A.get(i);
            String next = A.get(i+1);
            int len = Math.min(current.length(),next.length());
            if(len!=current.length() && len==next.length() && current.startsWith(next))
            {
                return 0;
            }
            for(int j=0;j<len;j++)
            {
                int val1 = mapping[current.charAt(j)-'a'];
                int val2 = mapping[next.charAt(j)-'a'];
                if(val1>val2)
                {
                    return 0;
                }
                if(val1<val2)
                {
                    break;
                }
//                if(map.get(current.charAt(j)) > map.get(next.charAt(j)))
//                {
//                    return 0;
//                }
//                if(map.get(current.charAt(j))<map.get(next.charAt(j)))
//                {
//                    break;
//                }
            }
        }
        return 1;
    }

    public static int solve(ArrayList<String> A,String B)
    {
        if(B=="")
        {
            return 0;
        }
        int flag=0;
        for(int i=0;i<A.size()-1;i++)
        {
            if(A.get(i).length()>A.get(i+1).length())
            {
                return 0;
            }
        }
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<B.length();i++)
        {
            map.put(B.charAt(i),i);
        }
        for(int i=0;i<A.size()-1;i++)
        {
            char fisrtChar=A.get(i).charAt(0);
            char secondChar=A.get(i+1).charAt(0);
            if(map.containsKey(fisrtChar) && map.containsKey(secondChar))
            {
                int getVal1 = map.get(A.get(i).charAt(0));
                int getVal2 = map.get(A.get(i).charAt(0));
                if(getVal1>getVal2)
                {
                    return 0;
                }
            }
        }
        return 1;
    }

    public static ArrayList<String> convert(String[] A)
    {
        ArrayList<String> ans = new ArrayList<>();
        for(int i=0;i<A.length;i++)
        {
            ans.add(A[i]);
        }
        return ans;
    }

}
