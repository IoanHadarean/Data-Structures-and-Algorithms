package com.company;

public class bubblesort{

    public static void main(String[] args) {

        int intArray[] = {20, 35, -15, 7, 55, 1, -22};
        bubbleSort(intArray, intArray.length);

        // Iterative bubblesort from left to right
//        for (int lastIndex =  intArray.length - 1; lastIndex > 0; lastIndex--) {
//            for (int i = 0; i < lastIndex; i++) {
//                if (intArray[i] > intArray[i+1]) {
//                    swap(intArray, i,i+1);
//                }
//            }
//        }
//
//        for (int i = 0; i < intArray.length; i++) {
//            System.out.println(intArray[i]);
//        }



//        int[] newArray = {20, -5, -20, 6, 9};
//
//        // Iterative bubblesort from right to left
//        for( int firstIndex = 0; firstIndex < newArray.length; firstIndex++) {
//            for (int i = newArray.length - 1; i > firstIndex; i-- ) {
//                if (newArray[i] > newArray[i-1]) {
//                    swap(newArray, i, i-1);
//                }
//            }
//        }
////
        for ( int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }


    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }

        int aux = array[i];
        array[i] = array[j];
        array[j] = aux;
    }

    // Recursive bubblesort from left to right
    public static void bubbleSort(int array[], int n) {
        if (n == 1)
            return;

        for (int i = 0; i < n - 1; i++) {
            if (array[i] > array[i+1]) {
                  swap(array, i, i+1) ;
            }
        }

        bubbleSort(array, n - 1);
    }

}

