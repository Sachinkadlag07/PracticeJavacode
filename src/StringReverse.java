public class StringReverse {

    public static String reversword(String str){

        String [] strr =str.split(" ");

        String result="";

        for(int i=strr.length-1;i>=0;i--){

            if(i==0){
                result = result +strr[i];
            }else {
                result = result + strr[i] + " ";

            }


        }


        return result;

    }


    public static void main(String[] args) {

        String Str= "Sach def in";

        String str= "I Love you";

        System.out.println(reversword(str));

        //using toCharArray() method
        char[] chArr= Str.toCharArray();
        int l = Str.length();

        for (int i = l - 1; i >= 0; i--) {
            System.out.print(chArr[i]);
        }



        System.out.println("\n"+"using chartAt(in index) method");

        for ( int i=l-1;i>=0;i--){
            System.out.print(Str.charAt(i));
        }

        System.out.println("\n"+ "Using String builder class with reverser method");

        StringBuilder stb= new StringBuilder(Str);
        System.out.println(stb.reverse());

        System.out.println("using String buffer class with reverser method");

        StringBuffer stbf=new StringBuffer(Str);
        System.out.println(stbf.reverse());


        String Str1 = "Try programiz.pro";


        char [] arr = Str1.toCharArray();

        int len = Str1.length();


        for(int i=len-1; i >=0 ; i--)
        {
            System.out.print(arr[i]);

        }


    }


}
