package com.company;

public class select {

    public static void main(String[] args) {

        int[] array = {20, 57, 68, 34, -5, -10};

        for (int lastUnsortedIndex =  array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex-- ) {
            int largest = 0;

            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (array[i] > array[largest]) {
                    largest = i;
                }
            }

            swap(array, largest, lastUnsortedIndex);
        }

//        for ( int firstIndex = 0; firstIndex < array.length  - 1; firstIndex++) {
//            int largest = array.length - 1;
//
//            for (int i = array.length - 2; i >= firstIndex; i--) {
//                if (array[i] > array[largest]) {
//                    largest = i;
//                }
//            }
//
//            swap (array, largest, firstIndex);
//        }



        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }


    public static void swap (int[] array, int i, int j) {
        if (i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

