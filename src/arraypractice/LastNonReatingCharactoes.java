package arraypractice;
import java.util.*;

public class LastNonReatingCharactoes {
    public static void main(String[] args) {

        String str ="automation";
        Map<Character,Integer> map =new LinkedHashMap<>();


        for(char ch:str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(int i=str.length()-1;i>0;i--){
            char ch=str.charAt(i);

            if(map.get(ch)==1)
                System.out.println(ch);
            break;
        }
    }
}
