package com.company.String;

public class Amazingsubarrays {
    public static void main(String[] args) {
        String a = "pGpEusuCSWEaPOJmamlFAnIBgAJGtcJaMPFTLfUfkQKXeymydQsdWCTyEFjFgbSmknAmKYFHopWceEyCSumTyAFwhrLqQXbWnXSn";
        int res = 0;
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)=='a' || a.charAt(i)=='A' || a.charAt(i)=='e' || a.charAt(i)=='e' ||
                    a.charAt(i)=='i' || a.charAt(i)=='I' ||  a.charAt(i)=='o' || a.charAt(i)=='O' || a.charAt(i)=='u' || a.charAt(i)=='U' )
            {
                //int ncr = ncrCalc(a.length(),i+1);

                res+=(a.length()-i);
            }
        }
        System.out.println(res);
    }
}
