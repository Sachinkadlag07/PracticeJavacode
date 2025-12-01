package StreamsCodeProblem;

import java.util.Arrays;
import java.util.List;

public class AvergeOfList {
    public static void main(String[] args) {

            List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);

            double avg = list.stream().mapToInt(e -> e).average().getAsDouble();
        System.out.println("avage is :"+avg);

        // without using stream api
        int sum =0;
        for( int i=0;i<list.size();i++){
             sum = sum + list.get(i);
        }
        int avg1 = sum/list.size();

        System.out.println(avg1);




    }
}
