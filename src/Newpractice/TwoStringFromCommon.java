package Newpractice;

import java.util.HashSet;

public  class TwoStringFromCommon {
    public static void main(String[] args) {

        String str = "this is an interview";
        String str2 = "this interview";

        String[] s1 = str.split(" ");
        String[] s2 = str2.split(" ");

        HashSet<String> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();
        HashSet<String> common = new HashSet<>();

        // Add all words from str to set1
        for (String word : s1) {
            set1.add(word);
        }

        // Add all words from str2 to set2
        for (String word : s2) {
            set2.add(word);
        }

        // Find common words
        for (String word : set1) {
            if (set2.contains(word)) {
                common.add(word);
            }
        }

        // Find unique words in str (not in str2)
        set1.removeAll(common);

        // Find unique words in str2 (not in str)
        set2.removeAll(common);

        System.out.println("Common words: " + common);
        System.out.println("Unique in str: " + set1);
        System.out.println("Unique in str2: " + set2);

        System.out.println("Try programiz.pro");
    }
}