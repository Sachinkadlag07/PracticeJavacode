package Newpractice;


public class CountVowelsAndConsonantsInString {
    public static void main(String[] args) {

        String str= "i am from india";
        int vowels=0; int consonants=0;

        String VowelsText= "aeiou";
        for(char c : str.toLowerCase().toCharArray()){
            if(c !=' '){

            if(VowelsText.indexOf(c) != -1){
                vowels++;
                System.out.print(c+" ");
            } else {
                consonants++;
                //System.out.print("Constant : "+c);
            }}

        }
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
    }
}
