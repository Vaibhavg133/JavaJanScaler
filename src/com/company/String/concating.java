package com.company.String;

public class concating {
    public static void main(String[] args) {
        String A = "AbcaZeoB";
        StringBuilder sb = new StringBuilder(A);
        for(int i=0;i<sb.length();i++)
        {
            if(sb.charAt(i)>='A' && sb.charAt(i)<='Z')
            {
                sb.delete(i,i+1);
            }
        }
        sb.append(sb);
        for(int i=0;i<sb.length();i++)
        {
            if(sb.charAt(i)=='a' || sb.charAt(i)=='e' || sb.charAt(i)=='i' || sb.charAt(i)=='o' || sb.charAt(i)=='u')
            {
                sb.replace(i,i+1,"#");
            }
        }
        System.out.println(sb);
        //sb.append(A);
//        System.out.println(sb);
//        for(int i=0;i<sb.length();i++)
//        {
//            if(sb.charAt(i)>='A' && sb.charAt(i)<='Z')
//            {
//                sb.delete(i,i+1);
//            }
//        }
//        System.out.println(sb);

//        String AA=concat(A);
//        System.out.println(AA);
//        String removeCap = removeCapital(AA);
//        System.out.println(removeCap);
//        String removeVow = replacevowel(removeCap);
//        System.out.println(removeVow);
    }
    public static String removeCap(StringBuilder A)
    {
        for(int i=0;i<A.length();i++)
        {
            if(A.charAt(i)>='A' && A.charAt(i)<='Z')
            {
                A.deleteCharAt(i);
            }
        }
        return new String(A);
    }
    public static String concat(String A)
    {
        return A+A;
    }
    public static String removeCapital(String A)
    {
        int countCapital=0;
        for(int i=0;i<A.length();i++)
        {
            if(A.charAt(i)>='A' && A.charAt(i)<='Z')
            {
                countCapital++;
            }
        }
        char[] res = new char[A.length()-countCapital];
        int count=0;
        for(int i=0;i<A.length();i++)
        {
            if(!(A.charAt(i)>='A' && A.charAt(i)<='Z'))
            {
                res[count]=A.charAt(i);
                count++;
            }
        }
        String rr = "";
        for(int i=0;i<res.length;i++)
        {
            rr+=res[i];
        }
        return rr;
    }
    public static String replacevowel(String A)
    {
        char[] res = A.toCharArray();
        for(int i=0;i<res.length;i++)
        {
            if(isVowel(res[i]))
            {
                res[i]='#';
            }
        }
        String finalres = "";
        for(int i=0;i<res.length;i++)
        {
            finalres+=res[i];
        }
        return finalres;
    }
    public static boolean isVowel(char c)
    {
        if(c=='a' || c=='A' || c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O' || c=='u' || c=='U')
        {
            return true;
        }
        return false;
    }



}
