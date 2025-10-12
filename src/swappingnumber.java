public class swappingnumber {

    public static void main(String[] args) {
        int a=200;
        int b= 400;
        int temp;

        // temp=a;
        // a=b;
        // b=temp;

        a = a+b; // 200+400=600
        b= a-b; // 600-400 =200
        a= a-b; //600-200=400

        System.out.println(a);
        System.out.println(b);



    }
}

