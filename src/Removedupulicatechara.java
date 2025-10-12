import java.util.HashSet;
import java.util.LinkedHashSet;

public class Removedupulicatechara {

    public static void main(String[] args) {

        String str="india is my conttyr ilove my contry";
        System.out.println("After removeing duplicate\n "+removeDuplicatechar(str));
        System.out.println("remove duplicate by linkedhashset\n"+removedupBycollectionframe(str));
        System.out.println("by using String builder to store value : "+ removeDuplicatecharactor(str));
    }

    public static String removeDuplicatechar (String str){

        String strnew ="";

        for(int i=0;i<str.length();i++){

            char ch =str.charAt(i);

            if(ch!=' ') {

                if (strnew.indexOf(ch) == -1) {

                    strnew = strnew + ch;
                }
            }

        }
        return strnew;

    }
    public static String removedupBycollectionframe (String str){

        HashSet<Character> set = new HashSet<>();

        StringBuilder result = new StringBuilder();

        for (char c:str.toCharArray()){
            if(c!=' ') {
                if (!set.contains(c)) {
                    set.add(c);
                    result.append(c);

                }
            }

        }

        return result.toString();

    }

    public static String removeDuplicatecharactor (String str){

        StringBuffer sb= new StringBuffer();

        for(int i=0;i<str.length();i++){

            char ch =str.charAt(i);

            if(ch!=' ') {

                if(sb.toString().indexOf(ch) == -1) {

                    sb.append(ch);
                }
            }

        }
        return sb.toString();

    }




}
