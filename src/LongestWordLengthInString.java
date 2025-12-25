public class LongestWordLengthInString {
    public static void main(String[] args) {

        String str = "Sachin lahanbhau kad";

         String[] word =str.split(" ");

         String longest =word[0];
         for(String w:word){
             if(w.length()>longest.length()){
                 longest =w;
             };
         }
        System.out.println("longest  : "+longest);

        String small =word[0];
        for(String w:word){

            if(w.length()<small.length()){
                small = w;
            };
        }
        System.out.println("small  : "+small);
    }
}
