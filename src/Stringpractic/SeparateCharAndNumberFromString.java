package Stringpractic;

public class SeparateCharAndNumberFromString {

    public static void main(String[] args) {

        String str = "sachin133Kadlag";

        // Without using regex

        StringBuilder charPart = new StringBuilder();
        StringBuilder numPart = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                numPart.append(ch);
            } else if (Character.isAlphabetic(ch)) {
                charPart.append(ch);

            }
        }

        System.out.println("Character part: " + charPart.toString());
        System.out.println("Number part: " + numPart.toString());

        // Using regex

        String lettee = str.replaceAll("[^A-Za-z]", "");
        String numbee = str.replaceAll("[^0-9]", "");
        System.out.println("Using regex - Character part: " + lettee);
        System.out.println("Using regex - Number part: " + numbee);

        //using regex split
        String lett = str.replaceAll("\\d", "");
        String numb = str.replaceAll("\\D", "");
        System.out.println("Using regex replaceAll - Character part: " + lett);
        System.out.println("Using regex replaceAll - Number part: " + numb);

    }
}
