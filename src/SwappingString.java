public class SwappingString {

    public static void main(String[] args) {

        String str1="hello";
        String str2="world";

        System.out.println("before swapping ");
        System.out.println("str1 "+ str1);
        System.out.println("str2 "+str2 );

        //swapping without 3rd variable

        str1=str1+str2;
        str2 =str1.substring(0,str1.length()-str2.length());
        str1=str1.substring(str2.length());

        System.out.println("after swapping");
        System.out.println("Str1 "+str1);
        System.out.println("str2 "+str2);




    }
}
