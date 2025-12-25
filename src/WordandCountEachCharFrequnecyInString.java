import java.util.HashMap;

public class WordandCountEachCharFrequnecyInString {
    public static void main(String[] args) {

        String str ="sachin Kadlag is dengerous and sachin is smart";

        String[] words = str.split(" ");

        for(String w:words){
            System.out.println("word: "+w);

            HashMap<Character,Integer> map = new HashMap<>();
            for(char ch:w.toCharArray()){
                map.put(ch,map.getOrDefault(ch,0)+1);

            }

            for(HashMap.Entry<Character,Integer> entry:map.entrySet()){
                System.out.println(entry.getKey()+": "+entry.getValue());
            }

          //  other way to print the char frequency

            for (Character ch : map.keySet()) {
                System.out.println(ch + " occurance : " + map.get(ch));
            }


        }
    }
}
