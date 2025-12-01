package StreamsCodeProblem;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class EvenAndOddByStream {
    public static void main(String[] args) {
         int [] arr = {1,2,3,4,5,6,7,8,9,10};

         List<Integer> list = Arrays.stream(arr).boxed().toList();

         list.stream().filter(e -> e%2==0).forEach(e-> System.out.println("even number :"+e));

      // List<Integer> even=   list.stream().filter(e ->e%2==0).collect(Collectors.asList());
            list.stream().filter(e -> e%2!=0).forEach(e-> System.out.println("odd number :"+e));

    }
}
