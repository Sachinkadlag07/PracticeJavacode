package Stringpractic;

public class CheckArrayMoutain {
    public static boolean isMountainArray(int[] arr) {
        if(arr.length<3){
            return false;

        }
        int i =0;
        while (i+1<arr.length && arr[i]<arr[i+1]){
            i++;
        }
        while(i+1<arr.length && arr[i]>arr[i+1]){
            i++;
        }

        return i==arr.length-1 && i!=0;
    }

    public static void main(String[] args) {

        int [] arr = {1,3,4,5,3,2,1};

        System.out.println(isMountainArray(arr));


    }
}
