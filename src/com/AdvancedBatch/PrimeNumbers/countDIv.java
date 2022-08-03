package com.AdvancedBatch.PrimeNumbers;

public class countDIv {
    public static void main(String[] args) {
        System.out.println(pf(2));
    }
    public static boolean pf(int A)
    {
        int i=1;
        while(i*i<=A)
        {
            i++;
        }
        if((i-1)*(i-1)==A)
        {
            return true;
        }
        return false;
    }

}
