package com.ferfykins.exercises;

public class CharacterSort {

    public static void main(String[] args) {

        char[] myChars = {'z', 'f', 'a', 'l', 'm', 's', 'h', 'p', 'm', 'r', 'g'};
        System.out.println("Array before sort: ");
        for(char chars : myChars) {
            System.out.print(chars + " ");
        }



        char temp;
        for(int i=0; i < myChars.length; i++) {
            for(int j=i+1; j<myChars.length; j++) {
                if(myChars[i] > myChars[j]) {
                    temp = myChars[i];
                    myChars[i] = myChars[j];
                    myChars[j] = temp;
                }
            }
        }

        System.out.println("Array after sort: ");
        for(char chars : myChars) {
            System.out.print(chars + " ");
        }






    }

}
