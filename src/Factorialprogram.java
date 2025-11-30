public class Factorialprogram {


    public static int factorial( int number){
        if (number==0 || number==1){
            return 1;
        }
        return number * factorial(number-1);

    }

    public static void main(String[] args) {

        System.out.println(factorial(5));

        int n=10;
        int f=1;


        for(int i=1;i<=n;i++){

            f=f*i;
            }
        System.out.println(f);



        for(int i=1;i<=n;i++) {
            f = f * i;
        }
        System.out.println("by calcuation : "+f);
        }


    }