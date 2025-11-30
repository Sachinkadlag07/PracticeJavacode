package arraypractice;

public class ArmstrongNumberValidation {
    public static void main(String[] args) {

        int number =153;

        int originalnum = number;
        int result=0;

         int n =String.valueOf(number).length();

         while(number>0){
             int digit =number%10;
             result +=Math.pow(digit,n);
             number =number/10;
         }
            if (result == originalnum){
                System.out.println(originalnum + " is an Armstrong number");
            } else {
                System.out.println(originalnum + " is not an Armstrong number");
            }

    }
}
