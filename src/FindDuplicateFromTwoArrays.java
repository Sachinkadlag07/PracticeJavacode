import java.util.HashSet;
import java.util.Set;

public class FindDuplicateFromTwoArrays {

    public static void main(String[] args) {
        int[] arr = {12, 44, 55, 34, 44, 12};
        int[] numbers = {12, 44, 55, 34, 44, 12, 34, 44, 55, 34};

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        // Add elements of first array to set1
        for (int num : arr) {
            set1.add(num);
        }

        // Check duplicates in second array
        for (int num : numbers) {
            if (set1.contains(num)) {
                duplicates.add(num);
            }
        }

        System.out.println("Duplicates between two arrays: " + duplicates);


    }
}


