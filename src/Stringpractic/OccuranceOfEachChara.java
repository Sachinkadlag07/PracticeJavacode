package Stringpractic;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfEachChara {

    public static void charctorCountEachWord(String Str){

        Map<Character,Integer> cmap = new HashMap<>();

        for (char ch:Str.toCharArray()){
            cmap.put(ch,cmap.getOrDefault(ch,0)+1);
        }

    // printing value of  charactors

        for(Map.Entry<Character,Integer>mentry:cmap.entrySet()){
            System.out.println(mentry.getKey()+": "+mentry.getValue());
        }


    }

    public static void main(String[] args) {
        String Str1="sachina";
        charctorCountEachWord(Str1);

    }

}
