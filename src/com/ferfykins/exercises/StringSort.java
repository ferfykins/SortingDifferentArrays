package com.ferfykins.exercises;

public class StringSort {

    public static void main(String[] args) {


        String[] myString = {"dog", "cat", "bird", "duck", "tiger", "bear", "squirrel", "raccoon", "owl", "snake"};


        System.out.println("Array before sort: ");
        for(String animals : myString) {
            System.out.print(animals + " ");
        }




        String temp;
        for(int i=0; i < myString.length; i++) {
            for(int j=i+1; j<myString.length; j++) {
                if(myString[i].charAt(0) == myString[j].charAt(0)) {
                    if(myString[i].charAt(1) > myString[j].charAt(1)) {
                        temp = myString[i];
                        myString[i] = myString[j];
                        myString[j] = temp;
                    }
                } else {
                    if((myString[i].charAt(0) > myString[j].charAt(0))) {
                        temp = myString[i];
                        myString[i] = myString[j];
                        myString[j] = temp;
                    }

                }
            }
        }

        System.out.println("Array after sort: ");
        for(String animals : myString) {
            System.out.print(animals + " ");
        }



    }



}
