package com.company;

public class select {

    public static void main(String[] args) {

        int[] array = {20, 57, 68, 34, -5, -10};

        // Iterative selection sort from left to right
        for (int lastUnsortedIndex =  array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex-- ) {
            int largest = 0;

            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (array[i] > array[largest]) {
                    largest = i;
                }
            }

            swap(array, largest, lastUnsortedIndex);
        }

    // Iterative selection sort from right to left
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
    
    // Recursive selection sort from left to right
    //    public static void selectSort(int [] array, int n) {
    //
    //        if (n == 2) {
    //            return;
    //        }
    //
    //        int largest = 0;
    //        for (int i = 1; i <= n - 1; i++) {
    //            if (array[i] > array[largest]) {
    //                largest = i;
    //            }
    //        }
    //        swap(array, largest, n-1);
    //
    //        selectSort(array, n-1);
    //    }

    //   Recursive selection sort from right to left
    //   public static void selectSort(int [] array, int n) {

    //     if (n == array.length - 2) {
    //         return;
    //     }

    //     int largest = array.length - 1;
    //     for (int i = array.length - 2; i >= n; i--) {
    //         if (array[i] > array[largest]) {
    //             largest = i;
    //         }
    //     }
    //     if (largest != n) {
    //         swap(array, largest, n);
    //     }

    //     selectSort(array, n+1);
    // }
}

