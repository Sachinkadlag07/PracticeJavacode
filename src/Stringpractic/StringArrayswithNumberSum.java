package Stringpractic;

public class StringArrayswithNumberSum {

    public static void main(String[] args) {

        String [] arr = {"5","9","a","#","170","&"};

        int sum =0;

        for(String str: arr){

            if(str.matches("\\d+")){
                int number = Integer.parseInt(str);
                sum = sum + number;
            }
        }

        System.out.println("Sum of numbers in the array: " + sum);
    }


}
