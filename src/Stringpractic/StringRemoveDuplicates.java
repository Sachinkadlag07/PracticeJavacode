package Stringpractic;

import java.util.HashSet;

public class StringRemoveDuplicates {

    public static void main(String[] args) {

        String str ="aabbccddeeff";

        HashSet<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for(char ch:str.toCharArray()){
            if(set.add(ch)){
                sb.append(ch);
            }
        }

        System.out.println(sb.toString());
    }
}
