package com.AdvancedBatch.Tries;

import java.util.HashMap;

public class trieTest {
    public static void main(String[] args) {
        Trie root = new Trie();
        String[] myString = {"Vaibhav","Akanksha","Aryan","Vaibhavi"};
        for(int i=0;i<myString.length;i++)
        {
            root.insert(myString[i]);
        }
        System.out.println(root.isPresent("Vaishnavi"));
    }
}
class TrieNode
{
    char data;
    HashMap<Character,TrieNode> map;
    Boolean isTerminal;
    TrieNode(char ch)
    {
        data=ch;
        map = new HashMap<>();
        isTerminal=false;
    }
}
class Trie
{
    TrieNode root;
    Trie()
    {
        root=new TrieNode('\0');
    }
    public void insert(String word)
    {
        TrieNode temp = root;
        for(int i=0;i<word.length();i++)
        {
            if(temp.map.containsKey(word.charAt(i))==false)
            {
                TrieNode n = new TrieNode(word.charAt(i));
                temp.map.put(word.charAt(i),n);
            }
            temp=temp.map.get(word.charAt(i));
        }
        temp.isTerminal=true;
    }
    public Boolean isPresent(String word)
    {
        TrieNode temp = root;
        for(int i=0;i<word.length();i++)
        {
            if(!temp.map.containsKey(word.charAt(i)))
            {
                return false;
            }
            temp=temp.map.get(word.charAt(i));
        }
        return temp.isTerminal;
    }


}


