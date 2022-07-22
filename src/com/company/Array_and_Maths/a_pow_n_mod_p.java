package com.company.Array_and_Maths;

public class a_pow_n_mod_p {
    public static void main(String[] args) {
        int res = power(3,41,7);
        System.out.println(res);
    }
    public static int power(int a, int n, int p)
    {
        int ans=1;
        for(int i=1;i<=n;i++)
        {
            ans=((ans%p)*(a%p))%p;
        }
        return ans;
    }

}
