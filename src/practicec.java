public class practicec {
    private static String s="welcome";

    String s1 = "sachin";
    String s2= "sachin";
    public static void main(String[] args) {

       // String s1 = "sachin";
       // String s2= "sachin";

        // Reversing the string

        String s3 ="online java compiler sachin kadlag";
        String []arr = s3.split(" ");

        for( int i= arr.length-1;i>=0;i--){
            if(i==0) {
                System.out.print(arr[i]);
            }
            else{
            System.out.print(arr[i]+" ");
        }}



        //String s2 = new String("sachin");x



        StringBuilder sb = new StringBuilder(s);

        //System.out.println(sb.equals(s));

        //System.out.println(s1==s2);
        //System.out.println(".equal method  " + s1.equals(s2));



    }

}


