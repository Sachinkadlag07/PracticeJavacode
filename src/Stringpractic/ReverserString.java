package Stringpractic;

public class ReverserString {

    public static void main(String[] args) {

        String st = "i Love vishakha";
        int len = st.length();

        StringBuffer BS = new StringBuffer();

        for ( int i =len-1; i>=0; i--){
            BS = BS.append(st.charAt(i));
        }
        System.out.println(BS.toString());
    }


}
