package Stringpractic;

public class NameCode{

    public static void main(String[] args) {

        String  str = "sachin Lahanbhau kadlag";

        String [] arr =str.toLowerCase().split(" ");

        StringBuilder result = new StringBuilder();

        for(int i =0;i<arr.length-1;i++){

            result.append(arr[i].charAt(0)).append(".");
        }
        result.append(arr[arr.length-1]);
        System.out.println(result);


    }

}
