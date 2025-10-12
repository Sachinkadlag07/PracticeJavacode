package arraypractice;

import java.util.HashSet;

public class findingduplicatefromarray

{
    public static void findduplicate (int[] arr){

        HashSet<Integer> elements = new HashSet<>();
        HashSet<Integer> duplicate= new HashSet<>();


        for(int num: arr){

            if(!elements.add(num)){
                duplicate.add(num);//Add to duplicate if already present in elements
            }
        }
        System.out.println("duplicate are : "+duplicate);



    }


    public static void main(String[] args) {

        int[] arr ={10,34,30,10,30,40,40,30};

        findduplicate(arr);




    }
}
