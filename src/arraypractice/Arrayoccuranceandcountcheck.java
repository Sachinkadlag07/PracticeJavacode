package arraypractice;

import java.util.HashMap;
import java.util.Map;

public class Arrayoccuranceandcountcheck {


    public static void main(String[] args) {

        String S1= "I am very good boy am I am ";

        int [] arr = {10,10,30,20,30,50,40,30};

        String [] sarr={"java","C","C++","java"};

        String [] S1arr =S1.split(" ");



        stringarrfrequncecheck(sarr); stringarrfrequncecheck(S1arr);

        checkfreq(arr);


        checkFreqWord(S1);


    }

    public static void stringarrfrequncecheck(String [] arr) {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            //if (entry.getValue()>1) {//to check if value is greater than 1 mean it duplicate charactor will be stored in it
            System.out.println(entry.getKey() + " " + entry.getValue());

        }

    }




    public static void checkfreq(int arr[]){
        Map<Integer,Integer> map =new HashMap<>();

        for( int i=0; i<arr.length; i++){

            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }

        }

        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

    }

    public static void  checkFreqWord(String str){

        String [] words = str.split(" ");

        HashMap<String,Integer> mapp = new HashMap<>();

        for(String word:words){
            mapp.put(word,mapp.getOrDefault(word,0)+1);

        }

        System.out.println(mapp);
    }
}
