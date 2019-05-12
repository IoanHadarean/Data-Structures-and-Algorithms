package com.company;

public class insertion {

    public static void main(String[] args) {

        int[] array = {30, 60, -3, 50, 100, -15, -10};

//        for (int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++) {
//            int newElement = array[firstUnsortedIndex];
//
//            int i;
//
//            for (i = firstUnsortedIndex; i > 0 && array[i - 1] > newElement; i--) {
//                array[i] =  array[i-1];
//            }
//
//            array[i] = newElement;
//        }


        for (int lastUnsortedIndex = array.length - 2; lastUnsortedIndex > -1; lastUnsortedIndex--) {
            int newElement = array[lastUnsortedIndex];

            int j;

            for (j = lastUnsortedIndex; j < array.length - 1 && array[j+1] > newElement; j++) {
                array[j] = array[j+1];
            }

            array[j] = newElement;
        }



        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}


