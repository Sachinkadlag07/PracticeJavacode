import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class FindDuplicatevalueinArryString {

    public static void main(String[] args) {

        String []arr = {"java","c","java","python"};

        boolean flag = false;
        for (int i=0;i<arr.length;i++){

            for (int j=i+1;j<arr.length;j++){

                if (arr[i]==arr[j]){
                    System.out.println("duplicate value is ="+arr[i]);
                    flag=true;
                }
            }
        }
        if(flag==false){
            System.out.println("Duplicate element not found");

        }

        String[] names = {"apple", "banana", "cherry", "apple", "banana", "date"};

        HashSet<String> seen = new HashSet<>();
        HashSet<String> duplicate = new HashSet<>();

        for(String name:names){
            if(!seen.add(name)){
                duplicate.add(name);
            }
        }

        System.out.println(duplicate);


        HashMap<String,Integer> map= new HashMap<>();
        for (String name:names){
            map.put(name,map.getOrDefault(name,0)+1);
        }

        //print duplicates

        for(Map.Entry<String,Integer> entry:map.entrySet()){
            if (entry.getValue()>1){
            System.out.println(entry.getKey()+": "+ entry.getValue());
            }
        }

    }
}
