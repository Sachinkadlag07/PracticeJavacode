package Newpractice;

import java.util.HashSet;
import java.util.Set;

public class CommonNumberInTwoArrays {
    public static void main(String[] args) {

        int [] a = {1,3,9,4,5,6};
        int [] b = {2,3,4,5,6,7};

        Set<Integer> set = new HashSet<>();
        for(int x:a)
        {set.add(x);
        }
        for(int y:b)
        {
            if(set.contains(y))
            {
                System.out.println("Common number in both array : "+y);

            }
        }


    }
}
