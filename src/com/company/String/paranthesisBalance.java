package com.company.String;

public class paranthesisBalance {
    public static void main(String[] args) {
        String a = "))((()(())";
        int countL = 0;
        int countR = 0;
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)=='(')
            {
                countL++;
            }
            if(a.charAt(i)==')')
            {
                countR++;
            }
        }
        System.out.println(countL);
        System.out.println(countR);
    }
}
