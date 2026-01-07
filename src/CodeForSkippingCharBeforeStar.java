public class CodeForSkippingCharBeforeStar {
    public static void main(String[] args) {


        String str = "Lea**cod*e";

        StringBuilder sb = new StringBuilder();


        for(char ch:str.toCharArray()){
            if(ch =='*'){
                if(sb.length()>0){
                    sb.deleteCharAt(sb.length()-1);
                }
            }
             else{
                sb.append(ch);
            }




        }
        System.out.println(sb.toString());
    }
}
