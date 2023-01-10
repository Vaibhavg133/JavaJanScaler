package com.AdvancedBatch.Tries;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class shortestPrefix {
    public static void main(String[] args) {
        String[] myList = {"zebra","dog","dove","duck"};
        ArrayList<String> result = stringToList(myList);
        Triee root = new Triee();
        for(String i : result)
        {
            root.insert(i);
        }
        ArrayList<String> res = new ArrayList<>();
        for(String i : result)
        {
            res.add(root.mainFunction(i));
        }
        for(String i : res)
        {
            System.out.print(i+" ");
        }
    }
    public static ArrayList<String> stringToList(String[] A)
    {
        ArrayList<String> myList = new ArrayList<>();
        for(int i=0;i<A.length;i++)
        {
            myList.add(A[i]);
        }
        return myList;
    }
}
class TrieNodee
{
    char data;
    HashMap<Character,TrieNodee> map;
    int freq;
    TrieNodee(char ch)
    {
        data=ch;
        map=new HashMap<>();
        freq=1;
    }
}
class Triee
{
    TrieNodee root;
    Triee()
    {root=new TrieNodee('\0');}
    public void insert(String word)
    {
        TrieNodee temp = root;
        for(int i=0;i<word.length();i++)
        {
            char ch = word.charAt(i);
            if(temp.map.containsKey(ch)==false)
            {
                TrieNodee myNode = new TrieNodee(ch);
                temp.map.put(ch,myNode);
            }
            temp.map.get(ch).freq++;
            temp=temp.map.get(ch);
        }
    }
    public String mainFunction(String word)
    {
        TrieNodee temp = root;
        for(int i=0;i<word.length();i++)
        {
            char ch = word.charAt(i);
            if(temp.map.get(ch).freq==2)
            {
                return word.substring(0,i+1);
            }
            temp=temp.map.get(ch);
        }
        return word;
    }


}





