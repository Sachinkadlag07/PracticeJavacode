package ArrayListProblems;

import java.util.*;

public class ListToAcceptInput {

    public static List<Integer> readList(Scanner sc, String listName) {
        System.out.println("Enter size of " + listName + ":");
        int size = sc.nextInt();
        List<Integer> list = new ArrayList<>(size);
        System.out.println("Enter " + size + " elements for " + listName + ":");
        for (int i = 0; i < size; i++) {
            list.add(sc.nextInt());
        }
        return list;
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list1 = readList(sc, "List 1");
        List<Integer> list2 = readList(sc, "List 2");

        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);

        sc.close();

        List<Integer> mergedList = new ArrayList<>();
        mergedList.addAll(list1);
        mergedList.addAll(list2);

        System.out.println("Merged List: " + mergedList);
        mergedList.sort(Collections.reverseOrder());
        System.out.println("Sorted Merged List: " + mergedList);






    }
}
