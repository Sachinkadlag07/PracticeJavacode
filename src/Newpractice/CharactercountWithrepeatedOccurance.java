package Newpractice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


public class CharactercountWithrepeatedOccurance {
    public static void main(String[] args) {


        String str = "aaabbccde";


        Map<Character, Integer> charCountMap = new LinkedHashMap<>();

        StringBuilder result = new StringBuilder();

        for (char ch : str.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        for(Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            result.append(entry.getKey()).append(entry.getValue());
        }


        System.out.println(result.toString());

    }
}
