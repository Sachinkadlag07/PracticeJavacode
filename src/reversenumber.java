import java.lang.invoke.StringConcatFactory;
import java.sql.SQLOutput;

public class reversenumber {

    public static void main(String[] args) {

        int n=123456; int rev=0;

        while(n>0){

            rev = rev*10+ n%10;
            n=n/10;
        }
        System.out.println(rev);



        //Sum of each digit in given number

        int num =123456;

        int sum=0;

        while (num>0){
            int reminder = num%10;
            sum= sum+reminder;
            num=num/10;
        }
        System.out.println("sum of each digit of number "+sum);


        int number =1234567;

        String Stnumber=String.valueOf(number);
        StringBuffer sbf = new StringBuffer(Stnumber);
        StringBuffer reversernumber =sbf.reverse();

        System.out.println("reverser number by stringbuffer "+reversernumber);


        StringBuilder sbr= new StringBuilder();
        sbr.append(number);
        StringBuilder reverse = sbr.reverse();

        System.out.println("by using string builder class "+reverse);


    }


}
