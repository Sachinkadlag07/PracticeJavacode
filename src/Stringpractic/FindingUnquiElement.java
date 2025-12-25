package Stringpractic;

import java.util.HashMap;

public class FindingUnquiElement {

    public static void main(String[] args) {

        int[] arr = {4,1,2,1,2,3,3};
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(int num :arr) {
            if (map.get(num) == 1) {
                System.out.print(num);
            }
        }
    }
}
