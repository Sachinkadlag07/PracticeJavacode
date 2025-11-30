package Stringpractic;

public class StringArrayswithNumberSum {

    public static void main(String[] args) {

        String [] arr = {"5","9","a","#","170","&"};

        int sum =0;

        for(String s: arr){

            if(s.matches("\\d+")){
                sum = sum + Integer.parseInt(s);
            }
        }

        System.out.println("Sum of numbers in the array: " + sum);
    }


}
