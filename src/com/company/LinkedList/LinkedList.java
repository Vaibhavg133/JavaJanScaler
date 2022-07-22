package com.company.LinkedList;

public class LinkedList {
    public static void main(String[] args) {
        Node n = new Node(5);
        Node n2 = new Node(7);
        n.next=n2;
    }
}
class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data = d;
        next=null;
    }

}

