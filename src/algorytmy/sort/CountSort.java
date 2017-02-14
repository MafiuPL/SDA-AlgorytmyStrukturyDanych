package algorytmy.sort;

import java.util.Arrays;

/**
 * Created by RENT on 2017-02-14.
 */
public class CountSort {
    public static void main(String[] args) {
        CountSort countSort = new CountSort();
        int[] array = {1, 1, 2, 3, 1, 1, 3, 5, 6, -7, -9, -4, -4, -7, 2, 2};
        System.out.println(Arrays.toString(countSort.ascSort(array)));

    }

    public int[] ascSort(int[] array) {
        int max = SortUtils.max(array);
        int min = SortUtils.min(array);
        int range = max - min + 1;
        int[] rangeArray = new int[range];
        for (int i = 0; i < array.length; i++) {
            rangeArray[array[i] - min]++;

        }
        int index = 0;
        for (int i = 0; i < rangeArray.length; i++) {
            for (int j = 0; j < rangeArray[i]; j++) {
                array[index] = i + min;
                index++;
            }
        }
        return array;
    }




    public int[] descSort(int[] array) {
return null;
    }
}
