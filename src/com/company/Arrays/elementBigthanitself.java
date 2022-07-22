package com.company.Arrays;

public class elementBigthanitself {
    public static void main(String[] args) {
        int[] arr = {2,3,10,7,3,2,10,8};
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(i!=j)
                {
                    if(arr[i]<arr[j])
                    {
                        count++;
                        break;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
