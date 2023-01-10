package com.AdvancedBatch.Queue;

import java.util.ArrayList;

public class perfectNumber {
    public static void main(String[] args) {
        int A = 6;
        String output = optimized(A);
        System.out.println(output);
    }
    public static String optimized(int A)
    {
        ArrayList<String> myres = new ArrayList<>();
        Qu myQu = new Qu();
        myQu.enqueue("1");
        myQu.enqueue("2");
        while(A!=0)
        {
            String front = myQu.getFront();
            String rev = reverse(front);
            StringBuilder finalString = new StringBuilder();
            finalString.append(front);
            finalString.append(rev);
            myres.add(finalString.toString());
            String frontOne = front+"1";
            String frontTwo = front+"2";
            myQu.enqueue(frontOne);
            myQu.enqueue(frontTwo);
            myQu.dequeue();
            A--;
        }
        return myres.get(myres.size()-1);
    }
    public static String reverse(String myRes)
    {
        StringBuilder output=new StringBuilder();
        for(int i=myRes.length()-1;i>=0;i--)
        {
            output.append(myRes.charAt(i));
        }
        return output.toString();
    }


}
class LLNode
{
    String data;
    LLNode next;
    LLNode(String data)
    {
        this.data=data;
        this.next=null;
    }
}
class Qu
{
    LLNode head;
    LLNode tail;
    Qu()
    {
        head=tail=null;
    }
    void enqueue(String data)
    {
        LLNode mynode = new LLNode(data);
        if(tail==null)
        {
            this.head=this.tail=mynode;
        }
        else
        {
            this.tail.next=mynode;
            tail=mynode;
        }
    }
    void dequeue()
    {
        if(this.head==null)
        {
            return;
        }
        this.head=head.next;
        if(this.head==null)
        {
            this.tail=null;
        }
    }
    String getFront()
    {
        return this.head.data;
    }
}



