/*Sort array manually, from least to greatest. Then reverse manually*/



package com.ferfykins.exercises;

import java.util.Random;

public class ManualSort {

    public static void main(String[] args) {



        Random ranNumber = new Random();
        int[] myIntArray = new int[100];

        for (int i = 0; i < myIntArray.length; i++) {
            myIntArray[i] = ranNumber.nextInt(99);
        }

        System.out.println("Array before sort: ");
        for (int numbers : myIntArray) {
            System.out.print(numbers + " ");
        }


        descending(myIntArray);

        System.out.println();
        System.out.println("Array after sort: ");
        for (int numbers : myIntArray) {
            System.out.print(numbers + " ");
        }


    }



    // methods:





    private static void sortThem1(int[] array) {
        int temp;
        for(int i = array.length-1; i > 0; i--) {
            for(int j = 0; j<i; j++) {
                if(array[j] > array[j+1]) {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }


    // Example of sortThem1:
    // 3 9 2 11 10

    // 3 2 9 10 11
    // 2 3 9 10 11
    // 2 3 9 10 11
    // 2 3 9 10 11

    // Something like:
    // ------------->
    // ----------->
    // --------->
    // ------>


    private static void sortThem2(int[] array) {
        int temp;
        for(int i=0; i < array.length; i++) {
            for(int j =i+1; j<array.length; j++) {
                if(array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    // I prefer this way of doing it
    // Example of sortThem2:
    // 3 9 2 11 10

    // 2 9 3 11 10
    // 2 3 9 11 10
    // 2 3 9 11 10
    // 2 3 9 10 11

    // Something like:
    // ---------->
    //   -------->
    //     ------>
    //       ---->



    private static void descending(int[] array) {
        int temp;
        for(int i=0; i < array.length; i++) {
            for(int j=i+1; j < array.length; j++) {
                if(array[j] > array[i]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }





}
