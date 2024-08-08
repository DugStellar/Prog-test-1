package org.example;
import java.util.Arrays;
import java.util.Random;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String [] strArr = new String [10];
        for (int i = strArr.length - 1; i >= 0; i--) {
            System.out.println(i + ": " + strArr[i]);
        }
        Random rand = new Random();
        int[] intArr = new int[50];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = rand.nextInt(50);
        }
        Arrays.sort(intArr);
        int[][] intArr = new int[5][8];
        }
    }


