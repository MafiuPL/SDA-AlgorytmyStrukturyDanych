package algorytmy.sort;

import java.util.Arrays;

/**
 * Created by RENT on 2017-02-14.
 */
public class SelectionSort {
    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        int[] array = {1, 3, 4, -6, -7, 2};
        System.out.println(Arrays.toString(selectionSort.ascSort(array)));
        System.out.println(Arrays.toString(selectionSort.descSort(array)));


    }

    public int[] ascSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int indexOfMax = 0;
            for (int j = 1; j < array.length - i; j++) {
                if (array[indexOfMax] < array[j]) {
                    indexOfMax = j;
                }
            }
            SortUtils.swap(array, indexOfMax, array.length - i - 1);
        }
        return array;

    }

    public int[] descSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int indexOfMin = 0;
            for (int j = 1; j < array.length - i; j++) {
                if (array[indexOfMin] > array[j]) {
                    indexOfMin = j;
                }
            }
            SortUtils.swap(array, indexOfMin, array.length - i - 1);
        }
        return array;
    }
}
