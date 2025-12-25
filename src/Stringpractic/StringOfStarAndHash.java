package Stringpractic;

public class StringOfStarAndHash {
    public static void main(String[] args) {
        String  str = "*#**##*#*##";

        int starCount =0;
        int hashCount =0;

        for(char ch: str.toCharArray()){
            if(ch=='*'){
                starCount++;
            } else if (ch=='#') {
                hashCount++;
            }
        }

        System.out.println(starCount-hashCount);
    }
}
