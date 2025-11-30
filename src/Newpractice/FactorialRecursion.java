package Newpractice;

public class FactorialRecursion {

    public static long factorial(int n){
        if (n==0){
            return 1; // Base codition as factorial of 0 is 1
        }
        return n*factorial(n-1);

    }

    public static void main(String[] args) {
        int num = 1;
        long result = factorial(num);
        System.out.println("Factorial of " + num + " is: " + result);
    }


}
