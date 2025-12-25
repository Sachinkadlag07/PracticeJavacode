package Stringpractic;

import com.sun.tools.javac.Main;

public class Stringpalindrome {
    public static boolean ispalindrome(String str){
        if (str ==null||str.isEmpty())
            return false;
        StringBuilder strb=new StringBuilder(str);
        strb.reverse();
       // System.out.println(strb);
        return strb.toString().equals(str);
    }

    public static void main(String[] args) {
        System.out.println(ispalindrome("sieis"));



    }

}
