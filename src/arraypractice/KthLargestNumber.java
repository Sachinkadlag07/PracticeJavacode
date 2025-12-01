package arraypractice;

import java.util.Arrays;

public class KthLargestNumber {
    public static int findKthLargest(int[] nums,int K){
        Arrays.sort(nums);
        return nums[nums.length - K];

    }

    public static void main(String[] args) {

        int [] arr = {3,2,1,5,6,4};
        int k =1;

        int result = findKthLargest (arr,k);
        System.out.println(k + "th largest number is: " + result);


    }
}
