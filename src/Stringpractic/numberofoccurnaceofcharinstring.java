package Stringpractic;

public class numberofoccurnaceofcharinstring {

    public static void main(String[] args) {
        String st = "sachin kadlag";
      char ch = 'a';
        int count = 0;


        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) == ch){
                count++;
            }
        }

        System.out.println("count of a "+count);

    }
}
