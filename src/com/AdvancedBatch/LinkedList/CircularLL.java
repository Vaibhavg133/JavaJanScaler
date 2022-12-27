package com.AdvancedBatch.LinkedList;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashSet;

public class CircularLL {
    public static void main(String[] args) {
        LL node = new LL(10);
        //LL middle = getMiddleNode(node);
        //System.out.println(middle.data);
        cycleMaker(node,20,false,0);
        cycleMaker(node,70,false,0);
        cycleMaker(node,40,false,0);
        cycleMaker(node,50,false,0);
        cycleMaker(node,60,false,0);
        //printLL(node);
        //System.out.println();
        //LL rev=reverseLL(node);
        //printLL(rev);
        LL root = new LL(1);
        addNode(root,5);
        addNode(root,8);
        LL root2 = new LL(2);
        addNode(root2,6);
        addNode(root2,9);

        LL root3=new LL(1);
        addNode(root3,1);
        addNode(root3,6);
        addNode(root3,4);
        addNode(root3,1);
        printLL(root3);
        System.out.println();
        LL rev3=reverseLL(root3);
        printLL(rev3);
        System.out.println(lPalin(root3));
        //LL myList = mergeSortofLL(node);
        //printLL(myList);
        //LL myList = mergeSortedLists(root,root2);
        //printLL(myList);
//        LL middleNode = getMiddleNode(root);
//        System.out.println(middleNode.data);
        //LL myL = mergeSortLL(node);
        //printLL(myL);
        //ArrayList<Integer> A = arrayListMakerFromLL(root);
        //ArrayList<Integer> B = arrayListMakerFromLL(root2);
        //ArrayList<Integer> myList = mergeSortedList(A,B);
//        for(int i : myList)
//        {
//            System.out.print(i+" ");
//        }
        //printLL(node);
        //cycleBreaker(node);
        //printLL(node);
        //LL middleNode = reorderList(node);
        //System.out.println(middleNode.data);
        //LL n = reorderList(node);
        //printLL(n);
    }
    public static int lPalin(LL A)
    {
        LL current = A;
        LL rev=reverseLL(A);
        while(current!=null)
        {
            if(current.data!=rev.data)
            {
                return 0;
            }
            current=current.next;
            rev=rev.next;
        }
        return 1;
    }
    public static LL sortMyList(LL A)
    {
        if(A!=null)
        {
            LL current=A;
            while(current!=null)
            {
                LL index = current.next;
                while(index!=null)
                {
                    if(index.data< current.data)
                    {
                        int temp = current.data;
                        current.data= index.data;
                        index.data=temp;
                    }
                    index=index.next;
                }
                current=current.next;
            }
        }
        return A;

    }
    public static LL mergeSortofLL(LL A)
    {
        if(A==null || A.next!=null)
        {
            return A;
        }
        LL middle=getMiddleNode(A);
        LL nextOfMiddle=middle.next;
        middle.next=null;
        LL left = mergeSortofLL(A);
        LL right = mergeSortofLL(nextOfMiddle);
        LL sortedList = mergeSort(A,nextOfMiddle);
        return sortedList;
    }
    public static LL mergeSort(LL A,LL B)
    {
        LL dummy=new LL(1);
        LL tail = dummy;
        while(true)
        {
            if(A==null)
            {
                dummy.next=B;
                break;
            }
            if(B==null)
            {
                dummy.next=A;
                break;
            }
            if(A.data<B.data)
            {
                dummy.next=A;
                A=A.next;
            }
            else
            {
                dummy.next=B;
                B=B.next;
            }
            dummy=dummy.next;
        }
        return tail.next;
    }


    public static LL mergeSortedLists(LL A, LL B)
    {
        LL dummy=new LL(1);
        LL result = dummy;
        while(true)
        {
            if(A==null)
            {
                dummy.next=B;
                break;
            }
            if(B==null)
            {
                dummy.next=A;
            }
            if(A.data<B.data)
            {
                dummy.next=A;
                A=A.next;
            }
            else
            {
                dummy.next=B;
                B=B.next;
            }
            dummy=dummy.next;
        }
        return result.next;
    }

    public static ArrayList<Integer> mergeSortedList(ArrayList<Integer> A, ArrayList<Integer> B)
    {
        ArrayList<Integer> myList = new ArrayList<>();
        int sizeA=0;
        int sizeB=0;
        while(sizeA<A.size() || sizeB<B.size())
        {
            if(A.get(sizeA)<B.get(sizeB))
            {
                myList.add(A.get(sizeA));
                sizeA++;
            }
            else
            {
                myList.add(B.get(sizeB));
                sizeB++;
            }
        }
        return myList;
    }

    public static ArrayList<Integer> arrayListMakerFromLL(LL root)
    {
        ArrayList<Integer> myList = new ArrayList<>();
        LL current = root;
        while(current!=null)
        {
            myList.add(current.data);
            current=current.next;
        }
        return myList;
    }

    public static LL reorderList(LL root)
    {
        //Get middle of LL
        LL slow=root;
        LL fast=root.next;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        //System.out.println(slow.data);
        //Split List in twos
        LL second = slow.next;
        slow.next=null;
        LL first = root;
        //System.out.println();
        //printLL(first);
        //System.out.println();
        //printLL(second);
        //System.out.println();
        LL secondReverse=reverseLL(second);
        //printLL(secondReverse);
        LL dummyNode = new LL(0);
        LL current = root;
        while(first!=null || secondReverse !=null)
        {
            if(first!=null)
            {
                current.next=first;
                current=current.next;
                first=first.next;
            }
            if(second!=null)
            {
                current.next=second;
                current=current.next;
                secondReverse=secondReverse.next;
            }
        }
        return root.next;
    }
    public static LL reverseLL(LL root)
    {
        LL current = root;
        LL prev = null;
        while(current!=null)
        {
            LL temp = current.next;
            current.next=prev;
            prev=current;
            current=temp;
        }
        return prev;
    }


    public static void cycleMaker(LL root,int data,Boolean flag,int K)
    {
        if(flag==false)
        {
            addNode(root,data);
        }
        else
        {
            LL myNode = new LL(data);
            LL lastNode = root;
            while(lastNode.next!=null)
            {
                lastNode=lastNode.next;
            }
            lastNode.next=myNode;
            LL current = root;
            while(K>0)
            {
                current=current.next;
                K--;
            }
            myNode.next=current;
        }
    }
    public static LL cycleBreaker(LL root)
    {
        HashSet<LL> set = new HashSet<>();
        LL current = root;
        LL startOfCycle=null;
        while(current!=null)
        {
            if(set.contains(current))
            {
                startOfCycle=current;
               break;
            }
            set.add(current);
            current=current.next;
        }
        return root;
    }


    public static void addNode(LL root,int data)
    {
        if(root==null)
        {
            LL node = new LL(data);
            root.next=node;
        }
        else
        {
            LL current=root;
            while(current.next!=null)
            {
                current=current.next;
            }
            current.next=new LL(data);
        }
    }
    public static void printLL(LL root)
    {
        LL current = root;
        while(current!=null)
        {
            System.out.print(current.data+" ");
            current=current.next;
        }
    }
    public static LL getMiddleNode(LL A)
    {
        LL fast=A;
        LL slow=A;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }


}
class LL
{
    int data;
    LL next;
    LL(int data)
    {
        this.data=data;
        next=null;
    }


}

