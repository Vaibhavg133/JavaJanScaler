package com.company.String;

public class bob {
    public static void main(String[] args) {
        String A = "abobc";//"bobob";
        String res = "bob";
        int count=0;
        int index=0;
        while(index!=-1)
        {
            index = A.indexOf(res,index);
            if(index!=-1)
            {
                count++;
                index+=res.length()+index;
            }
        }
        System.out.println(count+1);
    }
}
