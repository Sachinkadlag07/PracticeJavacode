package Newpractice;


public class RemoveVowelFromString {
    public static void main(String[] args) {

        String str = "Chak De India!";

        String vowels ="aeiouAEIOU";

        StringBuilder result  = new StringBuilder();

        for (char ch: str.toCharArray()){
            if(vowels.indexOf(ch) != -1){
                continue;
            } else {
                result.append(ch);
            }
        }

        System.out.println("String after removing vowels: : "+result.toString());

    }
}
