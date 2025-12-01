package Stringpractic;

public class StringArraySumOfNums {
    public static void main(String[] args) {
        String str = "10 20 30 40 50";
        String[] numStrings = str.split(" ");
        int sum = 0;

        for (String numStr : numStrings) {
            int num = Integer.parseInt(numStr);
            sum += num;
        }

        System.out.println("Sum of numbers: " + sum);
    }
}
