import java.sql.SQLOutput;
import java.util.Scanner;

public class Palindromeprogram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();

        int org_num= num;
        int rev_num=0;

        while(num>0){

            rev_num= rev_num*10+num%10;
            num=num/10;

        }

        if (rev_num==org_num){
            System.out.println("Given number is palindrome number ");
        }else{
            System.out.println("Given number is not palindrome number");
        }






    }
}
