package algorytmy.sort;

import java.util.Arrays;

/**
 * Created by RENT on 2017-02-14.
 */
public class BubbleSort {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] array = {1, -2, 3, 4, -6, 7, 8, 10};
        int[] sortedArray = bubbleSort.ascSort(array);
        System.out.println(Arrays.toString(sortedArray));
        System.out.println(Arrays.toString(bubbleSort.descSort(array)));
    }


    public int[] ascSort(int[] array) {
        boolean flag = true;
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            flag = true;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    counter++;
                    SortUtils.swap(array, j, j + 1);
                    flag = false;
                }
            }
            if (flag) {
                break;
            }

        }
        System.out.println(counter);
        return array;
    }


    public int[] descSort(int[] array) {
        boolean flag = true;
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            flag = true;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] < array[j + 1]) {
                    counter++;
                    SortUtils.swap(array, j, j + 1);
                    flag = false;
                }
            }
            if (flag) {
                break;
            }

        }
        System.out.println(counter);
        return array;
    }
}
