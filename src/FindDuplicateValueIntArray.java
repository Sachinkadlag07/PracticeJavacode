import java.util.HashMap;
import java.util.Map;

public class FindDuplicateValueIntArray {


    public static void main(String[] args) {

        int [] arr = {12,44,55,34,44,12,};

        int [] numbers= {12,44,55,34,44,12,34,44,55,34};

        findDuplicatenumber(numbers);




        for ( int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){

                if (arr[i]==arr[j]) {
                    System.out.println("duplicate element ="+arr[i]);

                }
            }
        }
    }
    private static void findDuplicatenumber(int[] number) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for (int num: number){
            map.put(num,map.getOrDefault(num,0)+1);
        }
       //System.out.println(map.get(34)+": sachin ");
        //print duplicates

        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if (entry.getValue()>1){
                System.out.println(entry.getKey()+": "+ entry.getValue());
            }
        }
    }
}
