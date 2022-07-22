package com.company.ModularMath;

import java.math.BigInteger;

public class power {
    public static void main(String[] args) {
        BigInteger b = new BigInteger("45651651981561561848646846515115616511");
        BigInteger a = BigInteger.valueOf(2);
        System.out.println(b.divide(BigInteger.valueOf(2)).mod(BigInteger.valueOf(7)));
        //System.out.println(a.pow(1000));
        System.out.println();
        BigInteger ans = BigInteger.valueOf(1);
        int num = 100;
        String A = "123456";
        System.out.println(A.charAt(5));
        //System.out.println(ans);
        System.out.println(ans.gcd(a));
    }

}
