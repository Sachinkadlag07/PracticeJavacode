package Stringpractic;

public class CheckNumberIsPowerofTwo {

    public static boolean isPoweroftwo(int num) {
        if(num<=0){
            return false;
        }
        while(num%2==0) {
            num = num / 2;

        }

        return (num ==1);
    }

    public static void main(String[] args) {
        int number = 18; // Example number to check
        if(isPoweroftwo(number)) {
            System.out.println(number + " is a power of two.");
        } else {
            System.out.println(number + " is not a power of two.");
        }
    }
}
