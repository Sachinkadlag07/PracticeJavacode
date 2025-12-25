package arraypractice;

import java.util.HashMap;

public class RomanTOIntConversion {

    public static int romanToInt(String str){
        int result =0;
        int prevValue =0;

        HashMap<Character,Integer>romanMap = new HashMap<>();
        romanMap.put('I',1);
        romanMap.put('V',5);
        romanMap.put('X',10);
        romanMap.put('L',50);

        for(int i =str.length()-1;i>=0;i--) {
            char ch = str.charAt(i);
            int currentValue = romanMap.get(ch);
            if (currentValue >= prevValue) {
                result += currentValue;
            } else {
                result -= currentValue;
            }

            prevValue = currentValue;
        }
        return result;


    }

    public static void main(String[] args) {

        String str ="VII";
        int intValue = romanToInt(str);
        System.out.println("The integer value of Roman numeral " + str + " is: " + intValue);

    }
}
