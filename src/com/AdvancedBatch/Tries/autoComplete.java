package com.AdvancedBatch.Tries;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class autoComplete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T!=0)
        {
            int N=sc.nextInt();
            int M=sc.nextInt();
            HashMap<Integer,String> TrieMap = new HashMap<>();
            for(int i=0;i<N;i++)
            {
                String myWord = sc.next();
                int weight =sc.nextInt();
                if(!TrieMap.containsKey(weight))
                {
                    TrieMap.put(weight,myWord);
                }
            }
            ArrayList<String> wordList = new ArrayList<>();
            for(int i=0;i<M;i++)
            {
                String word = sc.next();
                wordList.add(word);
            }
            autoCompleteTrie root = new autoCompleteTrie();
            TrieMap.entrySet().forEach(entry-> root.insert(entry.getValue()));

            T--;
        }
    }
}
class autoCompleteNode
{
    char data;
    HashMap<Character,autoCompleteNode> map;
    int freq;
    boolean isTerminal;
    autoCompleteNode(char c)
    {
        data=c;
        map=new HashMap<>();
        freq=1;
        isTerminal=false;
    }

}
class autoCompleteTrie
{
    autoCompleteNode root;
    autoCompleteTrie()
    {
        root=new autoCompleteNode('\0');
    }
    public void insert(String word)
    {
        autoCompleteNode temp = root;
        for(int i=0;i<word.length();i++)
        {
            char c = word.charAt(i);
            if(temp.map.containsKey(c))
            {
                autoCompleteNode myNode = new autoCompleteNode(c);
                temp.map.put(c,myNode);
            }
            temp.map.get(c).freq++;
            temp=temp.map.get(c);
        }
        temp.isTerminal=true;
    }
    public ArrayList<String> autoCompleteFunction(String word)
    {
        autoCompleteNode temp = root;
        ArrayList<String> result = new ArrayList<>();
        if(isExist(word))
        {
            for(int i=0;i<word.length();i++)
            {
                char c = word.charAt(i);
                if(temp.map.containsKey(c))
                {

                }
            }
        }
        else
        {
            ArrayList<String> nul = new ArrayList<>();
            nul.add("-1");
            return nul;
        }
        return result;
    }
    public boolean isExist(String word)
    {
        autoCompleteNode temp = root;
        //int counter=0;
        StringBuilder myString = new StringBuilder();
        for(int i=0;i<word.length();i++)
        {
            char c = word.charAt(i);
            if(temp.map.containsKey(c))
            {
                myString.append(c);
            }
            else
            {
                return false;
            }
        }
        if(word.equals(myString.toString()))
        {
            return true;
        }
        return false;
    }

}

