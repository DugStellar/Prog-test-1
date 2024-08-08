package org.example;

import java.util.Arrays;

public class BubbleSort{
    public static void main(String[] args) {


        int[] someNums = {10, 5, 20, 25, 29, 27, 22, 12, 8}; //STORES THE VALUES IN THE ARRAY\

        for (int a = 0; a < someNums.length - 1; ++a) // FOR LOOP TO SORT THE VALUES
            for (int b = 0; b < someNums.length - 1; ++b)
                if (someNums[b] > someNums[b + 1])
                {
                    int temp = someNums[b];
                    someNums[b] = someNums[b + 1];
                    someNums[b + 1] = temp;
                    System.out.println(Arrays.toString(someNums)); // DISPLAYS THE VALUES IN ORDER(BUBBLE SORT)
                }
    }
}
