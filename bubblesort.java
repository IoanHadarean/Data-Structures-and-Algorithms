package com.company;

public class bubblesort {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for (int lastUnsortedIndex =  intArray.length - 1; lastIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[i+1]) {
                    swap(intArray, i,i+1);
                }
            }
        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }



        int[] newArray = {20, 6, 9};


        for (int firstUnsortedIndex = 0; firstUnsortedIndex < newArray.length; firstUnsortedIndex++) {
            for (int i = newArray.length - 1; i > firstUnsortedIndex; i-- ) {
                if (newArray[i] > newArray[i-1]) {
                    swap(newArray, i, i-1);
                }
            }
        }

        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
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
}

