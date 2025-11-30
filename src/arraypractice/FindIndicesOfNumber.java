package arraypractice;

import java.util.ArrayList;

public class FindIndicesOfNumber {

    public static void main(String[] args) {
        int [] a= {8,3,5,0,4,0,9};
        int numberToFind = 0;

      //  findIndices(a,0);

        ArrayList indices = new ArrayList();

        for(int i=0;i<a.length; i++){
            if(a[i] == numberToFind){

                System.out.println("Number " + numberToFind + " found at index: " + i);
                indices.add(i);

            }

        }
        System.out.println("Number " + numberToFind + " found at index: " + indices);

    }

    public static void findIndices(int[] array, int number){

        ArrayList<Integer> indices = new ArrayList<>();

        for(int i=0; i<array.length;i++){
            if(array[i]==number){
                indices.add(i);
            }
        }
        System.out.println("Number " + number + " found at indices: " + indices);


    }



}
