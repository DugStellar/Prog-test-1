package org.example;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {

            int[] someNums = {20, 5 ,15, 10, 3, 17, 7};
            int a = 1;
            while( a < someNums.length)
            {
                int temp = someNums[a];
                int b = a - 1;
                while ( b >= 0 && someNums[b] > temp)
                {
                    someNums[b + 1] = someNums[b];
                    --b;
                }
                someNums[b + 1] = temp;
                ++a;
                System.out.println(Arrays.toString(someNums));
            }
        }
    }
