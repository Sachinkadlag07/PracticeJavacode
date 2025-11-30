package arraypractice;

import java.util.Arrays;

public class InArraySorting {

    public static void main(String[] args) {

        int [] a= {8,3,5,0,4,0,9};

        int len= a.length;
        int temp;

        for ( int i=0;i<len;i++){

            for( int j=i+1;j<len;j++){

                if(a[i]>a[j]){
                    temp= a[i];
                    a[i]=a[j];
                    a[j]=temp;

                }
            }
           // System.out.println(Arrays.toString(a));
        }

        System.out.println(Arrays.toString(a));

    }
}
