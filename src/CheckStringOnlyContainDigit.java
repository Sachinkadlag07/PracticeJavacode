public class CheckStringOnlyContainDigit {

    public static void main(String[] args) {

        String str ="2334213";

        boolean isNumeric = str.matches("\\d+");  // true if only digits
        System.out.println(isNumeric);

        boolean isnumber =true;
        for(char ch : str.toCharArray()){
            if(!Character.isDigit(ch)){
                isnumber = false;
                break;
            }
        }
        System.out.println(isnumber);

    }
}
