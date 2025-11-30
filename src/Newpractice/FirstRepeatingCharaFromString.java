package Newpractice;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatingCharaFromString {
    public static void main(String[] args) {
        String str ="programming";
        Set<Character> charset = new HashSet<>();
        for(char c : str.toCharArray()){
            if(charset.contains(c)){
                System.out.println("First repeating character: " + c);
                break;
            } else {
                charset.add(c);
            }
        }


    }
}
