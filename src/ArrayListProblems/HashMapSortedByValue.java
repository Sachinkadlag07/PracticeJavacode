package ArrayListProblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapSortedByValue {
    public static void main(String[] args) {

        HashMap<String,Integer> map = new HashMap<>();
        map.put ("Banana", 20);
        map.put ("Apple", 10);
        map.put ("Orange", 30);
        map.put ("Grapes", 25);
        map.put ("Pineapple", 15);
        System.out.println("Original HashMap: " + map);

        List<Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet());

        list.sort(Map.Entry.comparingByValue());

        System.out.println("HashMap sorted by values:" +map);

        for (Map.Entry<String,Integer> entry : list) {
            System.out.println(entry.getKey() + " = " + entry.getValue()); }




    }
}
