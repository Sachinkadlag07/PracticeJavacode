import java.util.Arrays;

public class Stringsorting {
    public static void main(String[] args) {

        String  Str = "sachinkadlag";


        //without using sort method

        char[] arry = Str.toCharArray();

        int len = arry.length;

        char temp ;

        for(int i=0; i<=len ;i++){

            for( int j= i+1;j<len;j++) {

                if (arry[i] > arry[j]) {
                    temp = arry[i];
                    arry[i] = arry[j];
                    arry[j] = temp;
                }
            }

        }
        System.out.println(new String (arry));





        // with using sort method


        String Str1= "vishakha";
        char[] arr= Str1.toCharArray();
        Arrays.sort(arr);
       // System.out.println(arr);

    }


    }




