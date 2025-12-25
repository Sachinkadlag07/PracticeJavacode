package arraypractice;

import java.util.ArrayList;

public class CheckNumberPrimeNumber {

    public static boolean isPrime(int num){

        if(num<=1){
            return false;
        }

        for(int i=2;i<=Math.sqrt(num);i++){
            if (num % i == 0) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {

        int arr[] = {3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        ArrayList<Integer> list =new ArrayList<>();



        for(int n: arr)

            if(isPrime(n)){
                list.add(n);
                System.out.println(n + " is a prime number");
              }
            else{
                System.out.println(n + " is not a prime number");
            }

        int a=11;

        System.out.println(isPrime(a));

        System.out.println(list);

        for(int i=2; i<=20;i++){
            if(isPrime(i)) {
                System.out.print(i + "\t");
            }

        }

    }
}
