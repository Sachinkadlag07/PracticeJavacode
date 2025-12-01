package Stringpractic;

import java.util.stream.Collectors;
import java.util.Arrays;

public class ReverserCharOfEachWordInString {

    public static void main(String[] args) {
        String Str = "Sachin Ramesh Tendulkar";
        String [] words = Str.split(" ");

       String collect = Arrays.stream(words).map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));

        System.out.println(collect);

        StringBuilder result = new StringBuilder();

        for(String word : words){
            StringBuilder reversedWord = new StringBuilder(word);
            result.append(reversedWord.reverse().toString()+" ");
        }

        System.out.println(result.toString().trim());
    }
}
