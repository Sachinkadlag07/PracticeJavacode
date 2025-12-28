package Newpractice;

import java.util.Arrays;

public class MoveZeroToEndOfArray {

    public static void moveZeroesToEnd(int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
                index++;
            }
        }

    }
        public static void main (String[]args){

            int[] arr = {0, 1, 0, 3, 12, 0, 5};

            System.out.println(Arrays.toString(arr));
            System.out.println("After moving zeroes to the end:");
            moveZeroesToEnd(arr);
            System.out.println(Arrays.toString(arr));

        }

}
