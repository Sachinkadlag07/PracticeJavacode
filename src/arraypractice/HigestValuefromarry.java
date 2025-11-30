package arraypractice;

import Stringpractic.ReverserString;

public class HigestValuefromarry {

    public static void main (String[]arg){

        int [] arr = {20,34,45,64,35,90,11};

        System.out.println("Highest value is : " + findHigestvalue(arr));

        int higest=arr[0];

        for( int i=0;i<arr.length;i++){

            if (arr[i]>higest){
                higest=arr[i];

            }

        }
        System.out.println(higest);

        System.out.println("Lowest value is : " + LowestValue(arr));

    }

    public static int findHigestvalue(int[] arr){

        int Highest = arr[0];

        for(int i=0; i<arr.length; i++){
            if (arr[i]>Highest){
                Highest = arr[i];
            }
        }
        return Highest;
    }

    public static int LowestValue(int [] arr){

        int lowest = arr[0];

        for( int i=0;i<arr.length;i++){

            if(arr[i]<lowest){
                lowest=arr[i];

            }
        }
        return lowest;
    }
}
