package arraypractice;

public class Plaidrom {



        public static boolean isPalendrom( String str){
            if (str==null|| str.isEmpty())
                return false;
            StringBuilder Sb = new StringBuilder(str);
            Sb.reverse();
            return(Sb.toString().equals(str));
        }



        public static void main(String[] args) {

            String str = "sachin";
            System.out.println(isPalendrom(str));
}}
