package ArrayListProblems;

import java.util.*;

public class FindFirstAndLastFromArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> List = new ArrayList<>();
        List.add(5);
        List.add(3);
        List.add(7);
        List.add(3);
        List.add(9);
        List.add(5);
        List.add(1);
        List.add(3);

        int first_number = List.getFirst();
        int last = List.getLast();
        int last_number = List.get(List.size() - 1);
        System.out.println("Original ArrayList: " + List);

        List.sort(Collections.reverseOrder());


        System.out.println("Sorted ArrayList: " + List);

        Collections.sort(List);
        System.out.println("Sorted ArrayList: " + List);
        System.out.println("First number in the ArrayList: " + first_number);
        System.out.println("Last number in the ArrayList: " + last_number);
        System.out.println("Last number in the ArrayList: " + last);



        TreeSet<Integer> set = new TreeSet<>(List);  //

        ArrayList<Integer> sortedList = new ArrayList<>(set);
        System.out.println("Sorted ArrayList without duplicates: " + sortedList);

        System.out.println("lowest value: " + sortedList.getFirst());
        System.out.println("highest value: " + sortedList.getLast());

        Integer[] arr = set.toArray(new Integer[0]);
        System.out.println("Array elements: " + Arrays.toString(arr));












    }
}

