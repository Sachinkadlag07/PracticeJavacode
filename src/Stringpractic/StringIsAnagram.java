package Stringpractic;

import java.util.Arrays;

public class StringIsAnagram {

    public static void main(String[] args) {

        String str1 = "listen";
        String str2 = "silent";

        char [] arr1  = str1.toCharArray();
        char [] arr2 = str2.toCharArray();

        if (arr1.length != arr2.length){
            System.out.println("Not anagram");

        } else {

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            if(Arrays.equals(arr1,arr2)){
                System.out.println("Anagram");
            } else {
                System.out.println("Not anagram");
            }
        }



    }
}
