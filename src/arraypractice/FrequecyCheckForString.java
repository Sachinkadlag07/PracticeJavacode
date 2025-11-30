package arraypractice;

import java.util.HashMap;
import java.util.Map;

public class FrequecyCheckForString {



        public static void frequencyCheck(String str){


            HashMap<Character,Integer> map = new HashMap<>();

            for (char ch:str.toCharArray()){
                if(ch!=' '){
                    map.put(ch,map.getOrDefault(ch,0)+1);

                }
                //map.put(ch,map.getOrDefault(ch,0)+1);

            }

            //print the value
            System.out.println(map);

            for(Map.Entry<Character,Integer>entry:map.entrySet()){

                System.out.println(entry.getKey()+ ":"+entry.getValue());

            }

        }



        public static void main(String[] args) {
            String str = "i am from india";

            frequencyCheck(str);







        }
}
