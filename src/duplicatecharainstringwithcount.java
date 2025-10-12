import java.util.HashMap;
import java.util.Map;

public class duplicatecharainstringwithcount {

    public static void main(String[] args) {

        String str="aindian";

        String input="programming";

        char[] ch= str.toCharArray();

        int count = 0;

        for (int i=0;i<=ch.length;i++ ){

            for(int j=i+1; j<ch.length;j++){

                if(ch[i]==ch[j]){
                    System.out.println("duplicate charctor = "+ch[j]);
                    count =count+1;
                }

            }


        } System.out.println("count ="+count);


        HashMap<Character,Integer>map =new HashMap<>();

        for (char c:input.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        //printing the value
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()>1){
            System.out.println(entry.getKey()+": "+entry.getValue());
        }}

    }

}


