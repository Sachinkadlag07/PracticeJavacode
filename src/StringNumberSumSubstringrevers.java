public class StringNumberSumSubstringrevers {

    public static void main(String[] args) {

        String str = "abcxyz12345";

        String letters =str.replaceAll("[^a-zA-Z]","");

        String numbers = str.replaceAll("[^0-9]","");

        //Reversing last 3 cha
        String firstpart = letters.substring(0,letters.length()-3);

        String Lastpart = new StringBuilder(letters.substring(letters.length()-3)).reverse().toString();

        String reversedletters = firstpart + Lastpart;
        System.out.println("Reversed Letters: "+reversedletters);

        int sum =0;
        for(char c: numbers.toCharArray()){
            sum += Character.getNumericValue(c);

        }

        System.out.println("Sum of Numbers: "+sum);



    }
}
