
/*Program to generate 100 random numbers and then sort them from lowest to highest.
Sorting them with sort function, and reversing them manually  */


package com.ferfykins.exercises;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random ranNumber = new Random();


        int[] myIntArray = new int[100];

        for (int i = 0; i < myIntArray.length; i++) {
            myIntArray[i] = ranNumber.nextInt(99);
        }


        Arrays.sort(myIntArray);

        for (int numbers : myIntArray) {
            System.out.print(numbers + " ");
        }

        System.out.println();
        System.out.println("---------------------------------------------------");


        int z = 0;
        int[] newNums = new int[myIntArray.length];
        for(int i=myIntArray.length-1; i >=0; i--) {
            newNums[z] = myIntArray[i];
            z++;
        }

        for(int numbers : newNums) {
            System.out.print(numbers + " ");
        }




    }


}
