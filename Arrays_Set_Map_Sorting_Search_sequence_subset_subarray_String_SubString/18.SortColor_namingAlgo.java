/*
* Sort by Color
Problem Description

Given an array with n objects colored red, white or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white and blue.
Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.

Note: Using library sort function is not allowed.



Problem Constraints
1 <= N <= 1000000
0 <= A[i] <= 2


Input Format
First and only argument of input contains an integer array A.


Output Format
Return an integer array in asked order


Example Input
Input 1 :
    A = [0 1 2 0 1 2]
Input 2:

    A = [0]


Example Output
Output 1:
    [0 0 1 1 2 2]
Output 2:

    [0]


Example Explanation
Explanation 1:
    [0 0 1 1 2 2] is the required order.
*
* */


package com.company.DSAlgo;

import java.util.ArrayList;
import java.util.Arrays;

public class SortColor {
    public static void main(String []args) {
        ArrayList < Integer > list = new ArrayList <> ( Arrays.asList (0,1 ,2 ,0 ,1 ,2));
        System.out.println (sortColors(list));
    }

        public static ArrayList<Integer> sortColors(ArrayList<Integer> A) {
            int lo = 0;
            int hi = A.size() - 1;
            int mid = 0, temp;
            while (mid <= hi) {
                switch (A.get(mid)) {
                    case 0: {
                        temp = A.get(lo);
                        A.set(lo,A.get(mid));
                        A.set(mid,temp);
                        lo++;
                        mid++;
                        break;
                    }
                    case 1:
                        mid++;
                        break;
                    case 2: {
                        temp = A.get(mid);
                        A.set(mid,A.get(hi));
                        A.set(hi,temp);
                        hi--;
                        break;
                    }
                }
            }
            return A;
        }
}
