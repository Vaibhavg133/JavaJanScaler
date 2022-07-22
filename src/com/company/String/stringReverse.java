package com.company.String;

public class stringReverse {
    public static void main(String[] args) {
        //char[] ch = {'V','a','i','b','h','a','v'};
       //char[] ch1 = {'I',' ','l','i','k','e',' ','e','a','t','i','n','g',' ','a','p','p','l','e','s'};
        //char[] ch1 = //{'I',' ','l','o','v','e',' ','m','y',' ','I','n','d','i','a'};
//        char[] ch1 = {'T','h','e',' ','s','k','y',' ','i','s',' ','b','l','u','e'};
//        char[] reverse = reverseWholeString(ch1);
//        System.out.println(reverse);
//        char[] word = reverseWord(reverse);
//        System.out.println(word);
        //String a = "   abc  ";
//        String a = "  def gth   i    ";
//        a=trimStart(a);
//        a=trimEnd(a);
//        System.out.println(a);
        //System.out.println(ch1.length);
        //char[] ch2 = {'a','b','c','b','d','e'};
        //System.out.println(isPallindrome(ch2,1,3));
//        System.out.println(ch);
        //String A = "Vaibhav";
//        String B = reverse(A);
//       System.out.println(B);
        //char[] a = {'b','a','t','m','a','n'};
        //char[] b = sortlowercase(a);
        //System.out.println(b);

//        stringReverse(ch,1,5);
        //reverse(ch1);
       // char[] A = {'a','b','c','b','d','e'};
    }


    public static String trimEnd(String A)
    {
        for(int i=A.length()-1;i>=0;i--)
        {
            if(A.charAt(i)!=' ')
            {
                return A.substring(0,i+1);
            }
        }
        return A;
    }

    public static String trimStart(String A)
    {
        for(int i=0;i<A.length();i++)
        {
            if(A.charAt(i)!=' ')
            {
                return A.substring(i);
            }
        }
        return A;
    }

    public static char[] reverseWord(char[] ch)
    {
        int P1=0;
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]==' ')
            {
                int P2=i-1;
                while(P1>=0 && P2<ch.length && P1<P2)
                {
                    char c = ch[P1];
                    ch[P1]=ch[P2];
                    ch[P2]=c;
                    P1++;
                    P2--;
                }
                P1=i+1;
            }
            else if(i==ch.length-1)
            {
                int P2=i;
                while(P1>=0 && P2<ch.length && P1<P2)
                {
                    char c = ch[P1];
                    ch[P1]=ch[P2];
                    ch[P2]=c;
                    P1++;
                    P2--;
                }
            }

        }
        return ch;
    }

    public static char[] reverseWholeString(char[] c)
    {
        int P1=0,P2=c.length-1;
        while(P1<P2)
        {
            char cc = c[P1];
            c[P1]=c[P2];
            c[P2]=cc;
            P1++;
            P2--;
        }
        return c;
    }
    public static char[] sortlowercase(char[] ch) {
        int P1=0;
        int P2=ch.length-1;
        for(int i=0;i<ch.length-1;i++)
        {
            for(int j=0;j<ch.length-i-1;j++) {
                if(ch[j]>ch[j+1]) {
                    char c = ch[j];
                    ch[j]=ch[j+1];
                    ch[j+1]=c;
                }
            }
        }
        return ch;
    }
    public static String reverse(String A)
    {
        char[] s = A.toCharArray();
        int P1=0;
        int P2=A.length()-1;
        while(P1<P2)
        {
            char c = s[P1];
            s[P1]=s[P2];
            s[P2]=c;
            P1++;
            P2--;
        }
        return new String(s);
    }
    public static boolean isPallindrome(char[] c, int s, int e)
    {
        boolean flag = true;
        char[] result = new char[c.length];
        for(int i=0;i<c.length;i++)
        {
            result[i]=c[i];
        }
       // result=c;
        int P1=s,P2=e;
        while(P1<P2)
        {
            char a = result[P1];
            result[P1]=result[P2];
            result[P2]=a;
            P1++;
            P2--;
        }
        for(int i=0;i<c.length;i++)
        {
            if(c[i]!=result[i])
            {
                flag=false;
                break;
            }
        }
        return flag;
    }
    public static void reverse(char[] ch)
    {
        int P1=0;
        int P2=ch.length-1;//ch[ch.length-1];
        while(P1<P2)
        {
            char c = ch[P1];
            ch[P1]=ch[P2];
            ch[P2]=c;
            P1++;
            P2--;
        }
        System.out.println(ch);
        reverseWordbyWord(ch);
    }
    public static void reverseWordbyWord(char[] ch)
    {
        int P1=0;
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]==' ')
            {
                int P2=i-1;
                while(P1<P2)
                {
                    char c = ch[P1];
                    ch[P1]=ch[P2];
                    ch[P2]=c;
                    P1++;
                    P2--;
                }
                P1=i+1;
            }
            //System.out.println(ch);
        }
        System.out.println(ch);
        System.out.println(ch.length);
    }
    public static void stringReverse(char[] ch,int s,int e)
    {
        int P1=s;
        int P2=e;
        while(P1<P2)
        {
            char temp = ch[P1];
            ch[P1]=ch[P2];
            ch[P2]=temp;
            P1++;
            P2--;
        }
        System.out.println(ch);
    }

}
