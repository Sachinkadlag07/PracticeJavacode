package arraypractice;

import java.util.ArrayList;

public class IndicesInArray {
    public static void findIndices(int[] arr, int targetnum) {
        ArrayList<Integer> indices = new ArrayList<>();
        for(int i =0;i<arr.length;i++){
            if(arr[i]==targetnum){
                indices.add(i);
            }
        }

        if(!indices.isEmpty()){
            System.out.println(indices);
        }
        else{
            System.out.println("No Element found ");
        }

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,7,3,9};
        int targetnum = 3;

        findIndices(arr,targetnum);
    }
}
