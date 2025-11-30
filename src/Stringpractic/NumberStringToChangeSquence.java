package Stringpractic;

public class NumberStringToChangeSquence {
    public static String rearragestring(String str) {
        StringBuilder digits = new StringBuilder();
        StringBuilder nondigit = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                digits.append(ch);
            } else {
                nondigit.append(ch);
            }
        }

        return digits.toString() + nondigit.toString();
    }

    public static void main(String[] args) {
        String str = "32400121200";

        String Rearranged = rearragestring(str);
        System.out.println("Rearranged String: " + Rearranged);

        String result= str.replaceFirst("00","");
        System.out.println(result);
        result+="00";
        System.out.println(result);

        int zeroCount=0;
        StringBuilder nonzero= new StringBuilder();
        for(char c: str.toCharArray()){
            if(c=='0'){
                zeroCount++;
            } else {
                nonzero.append(c);
            }
        }

        String finalResult= nonzero.toString() + "0".repeat(zeroCount);
        String zerofist_result= "0".repeat(zeroCount) + nonzero.toString();
        System.out.println("Final Result: " + finalResult);
        System.out.println("Zero First Result: " + zerofist_result);




    }
}
