public class StringPrograme {

    //Remove specific charater form string

    public static void main(String[] args) {

        String str="maysachinmemennnennd";

        String S1= " sachin kadlag var3QA ";

        String Plainstr=str.replaceAll("n","");

        String p2 = S1.replace("\s","");

        System.out.println(Plainstr);
        System.out.println(p2);

    }
}

