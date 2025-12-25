package Stringpractic;

public class NumberOfStringsThatAppearAsSubstringInWord {
    public static void main(String[] args){

        String word = "leetcode";
        String[] patterns = {"leet","code","leetcode","leetcod","etco"};
        int count =0;

        for(String pattern: patterns){
            if(word.contains(pattern)){
                count++;
            }
        }
        System.out.println(count);
    }

}
