/*Program to generate 100 random numbers and then sort them from lowest to highest.
* Sorting them with sort function, and reversing them with reverse method. Using Integer objects with Lists.*/



package com.ferfykins.exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Yas {


    public static void main(String[] args) {
        Random ranNumber = new Random();


        Integer[] myIntArray = new Integer[100];

        for (int i = 0; i < myIntArray.length; i++) {
            myIntArray[i] = ranNumber.nextInt(99);
        }


        Arrays.sort(myIntArray);

        for (int numbers : myIntArray) {
            System.out.print(numbers + " ");
        }

        System.out.println();
        System.out.println("----------------------------------------------");

        Collections.reverse(Arrays.asList(myIntArray));
        System.out.println(Arrays.asList(myIntArray));


    }



}
