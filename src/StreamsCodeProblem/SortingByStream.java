package StreamsCodeProblem;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortingByStream {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5, 3, 8, 1, 2);
        List<Integer> sortasc = numbers.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted in ascending order: " + sortasc);
        List<Integer> desc = numbers.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println("Sorted in descending order: " + desc);



    }
}
