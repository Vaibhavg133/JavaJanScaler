package org.hyperskill;

import com.mypackage.Tiger;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        int[][] A = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        reverseElements(A);
        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<A[i].length;j++)
            {
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static void reverseElements(int[][] twoDimArray) {
        // write your code here
        for(int i=0;i<twoDimArray.length;i++)
        {
            int j=0; int k=twoDimArray[i].length-1;
            while(j<=k)
            {
                int temp = twoDimArray[i][j];
                twoDimArray[i][j]=twoDimArray[i][k];
                twoDimArray[i][k]=temp;
                j++;
                k--;
            }
        }

    }
}
