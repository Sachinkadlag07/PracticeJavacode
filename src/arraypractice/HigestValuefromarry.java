package arraypractice;

public class HigestValuefromarry {

    public static void main (String[]arg){

        int [] arr = {20,34,45,64,35,90};

        int higest=arr[0];

        for( int i=0;i<arr.length;i++){

            if (arr[i]>higest){
                higest=arr[i];

            }

        }
        System.out.println(higest);

    }
}
