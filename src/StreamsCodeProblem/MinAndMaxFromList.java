package StreamsCodeProblem;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinAndMaxFromList {
    public static void main(String[] args) {
     List<Integer> list = Arrays.asList(5, 3, 8, 1, 2, 7);

         int min =list.stream().min(Comparator.comparing(Integer::valueOf)).get();
         int max  =list.stream().max(Comparator.comparing(Integer::valueOf)).get();

        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);


    }
}

