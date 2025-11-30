package Stringpractic;

public class StringNumberSeparation {

    public static void main(String[] args) {
        String str= "abc-2019";

        String [] parts = str.split("-");
        String Letters = parts[0];
        String numbers = parts[1];

        System.out.println("Letters part: " + Letters);
        System.out.println("Numbers part: " + numbers);

    }

}
