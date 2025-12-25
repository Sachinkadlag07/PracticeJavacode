public class RemoveSpecialChara {
    public static void main(String[] args) {

        String str = "@sachin@12*%%";

        String newstring = str.replaceAll("[^A-Za-z0-9\\s]","");
        System.out.println(newstring);

        String output="";

        for(char ch:str.toCharArray()){
            if(Character.isAlphabetic(ch)){
                output=output +ch;
            }
        }

        System.out.println(output);




    }
}
