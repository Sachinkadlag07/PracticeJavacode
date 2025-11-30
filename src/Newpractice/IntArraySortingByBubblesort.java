package Newpractice;

import java.util.Arrays;

public class IntArraySortingByBubblesort {

    public static void main(String[] args) {
        int [] arr = {5, 2, 8, 1, 3};
        int n = arr.length;
        int temp ;

        for(int i=0; i<=n;i++){

            for(int j=i+1; j<n;j++ ){
                if (arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }


}
