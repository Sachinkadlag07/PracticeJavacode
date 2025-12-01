package StreamsCodeProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfAllelementInArrayList {

    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(2,3,5,7,11,13,17,19,23,29);

        Optional<Integer> sum = list.stream().reduce((a, b) -> a+b);

        System.out.println("Sum of all elements in ArrayList: "+sum.get());

        int sum1 = 0;
        for(int num : list){
            sum1+=num;
        }

        System.out.println("Sum of all elements using for loop: "+sum1);
    }
}
