package Newpractice;

import java.util.Arrays;

public class MergedAndSortTwoArray {
    public static void main(String[] args) {
        int [] arr1 = {5, 2, 8};
        int [] arr2 = {7, 1, 4};

        int [] merged = new int[arr1.length +arr2.length];

        System.arraycopy(arr1,0,merged,0,arr1.length);
        System.arraycopy(arr2,0,merged,arr1.length,arr2.length);

        Arrays.sort(merged);

    System.out.println(Arrays.toString(merged));
    }
}
