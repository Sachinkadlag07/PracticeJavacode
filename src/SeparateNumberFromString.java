public class SeparateNumberFromString {
    public static void main(String[] args) {
        String str = "abc123def456";

        String digit  = str.replaceAll("\\D","");

        System.out.println(digit);

        String digits = str.replaceAll("\\D", "");     // Only digits
        String letters = str.replaceAll("\\d", "");// this small d is for digit and capital D is for non digit

        System.out.println("L"+letters);
        System.out.println(digits);

        StringBuilder number = new StringBuilder();

        for (char c : str.toCharArray()){
            if (Character.isDigit(c)){
                number.append(c);

            }

        }
        System.out.println("number separate = "+number);

    }
}
