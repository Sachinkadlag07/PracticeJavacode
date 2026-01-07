package arraypractice;

public class FirstNonRepeatingCharactors {


    public static char firstNonRepeatingCharacter(String str) {
        for (char ch : str.toCharArray()) {
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                return ch;
            }
        }
        return '\0'; // Return null character if no non-repeating character is found
    }
    public static void main(String[] args) {
        String  str = "automation";

        char result = firstNonRepeatingCharacter(str);


        if (result != '\0') {
            System.out.println("First non-repeating character by method : " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }


        for(char ch:str.toCharArray()){
            if(str.indexOf(ch)==str.lastIndexOf(ch)){
                System.out.println("First non-repeating character: "+ch);
                //break;
            }
        }
    }
}
