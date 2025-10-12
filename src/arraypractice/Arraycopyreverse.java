package arraypractice;

import java.sql.Array;
import java.util.Arrays;

public class Arraycopyreverse {
    public static void main(String[] args) {

        int [] a= {2,4,6,7,0,5,0};

        int len= a.length;

        int [] b= new int[a.length];

        for(int i=0;i<len;i++){


            b[i]=a[i]; //copy arrry of a to b

          System.out.print(b[i] +"\t");
        }

        Arrays.sort(a);
//            System.out.println("second highest = "+num);

      //  }
        System.out.println("second high : "+b[len-2]);
        System.out.println("second high : "+a[len-2]);

    // 3rd highest number in array  2nd and 1st highest
        int [] d = {1,5,9,6,7,8,2,3};

        Arrays.sort(d);

        System.out.println("1rd highest "+ d[d.length-1]);
        System.out.println("2rd highest "+ d[d.length-2]);
        System.out.println("3rd highest "+ d[d.length-3]);






    }
}
