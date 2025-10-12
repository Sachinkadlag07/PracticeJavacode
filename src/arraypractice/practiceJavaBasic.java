package arraypractice;

public class practiceJavaBasic {

    public static void main (String[] args) {

        //we can unicode for main = \u006d\u0061\u0069\u006e
        System.out.println("Try programiz.pro");


        //with out ifelse check the pass or fail
        int marks = 34;

        String[] result = {"Fail", "Pass"};
        System.out.println(result[marks/35]);


        // check to string are literal
        String s1 = "hello";
        String s2 = "he"+"llo";
        System.out.println(s1==s2); // true

        int x=1;
        int y = x++;
        System.out.println(x+" "+y); //2 1

        //swapping in one line

        int a=20;
        int b =40;

        // a=a+b-(b=a);
        a=a^b^(b=a);

        System.out.println("a:"+a);
        System.out.println("b:"+b);

         // Integer concept true or false

        Integer c = 128;
        Integer d = 128;
        System.out.println(c==d);   // false

        // calculation pre-increment

        int g=3;
        System.out.println(++g*8); // 32

        // Charctor addtion out put will 131 - unicode addtion will be happen

        System.out.println('A'+'B'); // 131
        System.out.println('S');    // S




    }
}
