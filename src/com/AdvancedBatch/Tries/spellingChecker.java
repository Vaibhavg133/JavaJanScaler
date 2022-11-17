package com.AdvancedBatch.Tries;

import java.util.HashMap;

public class spellingChecker {
    public static void main(String[] args) {
        String[] words = {"hat","cat","rat"};
        String[] query = {"cat","ball"};
        int[] result = myFunc(words,query);
        for(int i : result)
        {
            System.out.print(i+",");
        }
    }
    public static int[] myFunc(String[] A,String[] B)
    {
        int[] result = new int[B.length];
        Tries myTries = new Tries();
        for(String a : A)
        {
            myTries.insertNode(a);
        }
        int counter=0;
        for(String a : B)
        {
            if(myTries.searchNode(a))
            {
                result[counter]=1;
                counter++;
            }
            else
            {
                result[counter]=0;
                counter++;
            }
        }
        return result;
    }

}
class Node
{
    char data;
    HashMap<Character,Node> hm;
    boolean isTerminal;
    Node(char c)
    {
        data=c;
        hm=new HashMap<>();
        isTerminal=false;
    }
}
class Tries
{
    Node root;
    Tries()
    {
        root=new Node(' ');
    }
    void insertNode(String word)
    {
        Node temp = root;
        for(int i=0;i<word.length();i++)
        {
            if(temp.hm.containsKey(word.charAt(i)))
            {
                temp = temp.hm.get(word.charAt(i));
            }
            else
            {
                Node n =new Node(word.charAt(i));
                temp.hm.put(word.charAt(i),n);
            }
        }
        temp.isTerminal=true;
    }
    boolean searchNode(String word)
    {
        Node temp = root;
        for(int i=0;i<word.length();i++)
        {
            if(temp.hm.containsKey(word.charAt(i)))
            {
                temp=temp.hm.get(word.charAt(i));
            }
            else
            {
                return false;
            }
        }
        return temp.isTerminal;
    }
}


