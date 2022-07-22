package com.company.Jan;
import java.io.*;
import java.util.*;
public class LittlePony {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        Integer[][] matrix=new Integer[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }
        transposeMatrix(matrix);
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix.length;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        //        int[] A = {1,2,5,7};
//        int[] B = {3,6,15};
//        int[] ans=littlePont(A,B);
//        for(int x:ans)
//        {
//            System.out.print(x+" ");
//        }

//        Scanner sc=new Scanner(System.in);
//        int[] A={1,2,5,7};
//        for(int i=1;i<A.length;i++)
//        {
//            A[i]=A[i]+A[i-1];
//        }
//        //{1,3,8,15}
//        int[] B={3,6,15};
//        int[] ans=new int[B.length];
//        int count=0;
//        String res="";
//        for(int i=0;i<B.length;i++)
//        {
//            for(int j=0;j<A.length;j++)
//            {
//                if(A[j]>=B[i])
//                {
//                    res+=j+" ";
//                    break;
//                    //ans[count]=j;
//                    //count++;
//                }
//            }
//        }
//        System.out.println(res);
////        for(int i=1;i<B.length;i++)
////        {
////            ans[i]=binarySearch(A,B[i]);
////        }
//        for(int x:ans)
//        {
//            System.out.print(x+" ");
//        }

        //System.out.println(Arrays.toString(A));
    }
    public static void transposeMatrix(Integer[][] A)
    {
        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<A.length;j++)
            {
                int temp = A[i][j];
                A[i][j]=A[j][i];
                A[j][i]=temp;
            }
        }
    }

    public static ArrayList<Integer> littlePony(ArrayList<Integer> A, ArrayList<Integer> B )
    {
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=1;i<A.size();i++)
        {
            A.set(i,A.get(i)+A.get(i-1));
        }
        for(int i=0;i<B.size();i++)
        {
            int count=0;
            int start=0;
            int end=A.size()-1;
            while(start<=end)
            {
                int mid=(start+end)/2;
                if(B.get(i)>=A.get(mid))
                {
                    count=mid+1;
                    start=mid+1;
                }
                else
                {
                    end=mid-1;
                }
            }
            ans.add(count);
        }
//        for(int i=0;i<B.size();i++)
//        {
//            int count=0;
//            Integer num=B.get(i);
//            for(int j=0;j<A.size();j++)
//            {
//                if(A.get(j)<=num)
//                {
//                    count++;
//                }
//            }
//            ans.add(count);
//        }
        return ans;
    }

    public static void spiralArray(int[][] arr)
    {

        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(arr[j][i]+" ");
            }
            //System.out.println();
        }
    }

    public static int[] littlePont(int[] A, int[] B)
    {
        int[] ans=new int[B.length];
        for(int i=0;i<B.length;i++)
        {
            int count=0;
            int no=B[i];
            for(int j=0;j<A.length;j++)
            {
                if(no<=A[j])
                {
                    count++;
                }
            }
            ans[i]=count;
        }
        return ans;
    }

    public static int binarySearch(int[] A,int B)
    {
        int start=0;
        int end=A.length;
        int mid=(start+end)/2;
        while(start<=end)
        {
            if(A[mid]>B)
            {
                end=mid-1;
            }
            else if(A[mid]<B)
            {
                start=mid+1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
    public static int[] littlePony(int[] A, int[] B)
    {
        int[] ans=new int[B.length];
        int count=0;
        for(int i=0;i<B.length;i++)
        {
            int no=B[i];
            int sum=0;
            for(int j=0;j<A.length;j++)
            {
                sum=sum+A[j];
                if(sum>no)
                {
                    ans[count]=j;
                    count++;
                    break;
                }
            }
            if(sum<=no)
            {
                ans[count]=i;
            }
        }
        return ans;
    }

}
