public class ReturnFirstCharFormWordOfString {
    public static void main(String[] args) {

        String str = "Hello World From Java";

        String[] words = str.split(" ");

        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(word.charAt(0));

        }
        System.out.println(result.toString());


        String input = "Sachin Lahanbhau Kadlag";

        String[] parts = input.split(" ");

        StringBuilder output = new StringBuilder();

        for (int i = 0; i < parts.length - 1; i++) {
            output.append(parts[i].charAt(0)).append(".");

        }

        output.append(parts[parts.length - 1]);

        System.out.println(output.toString());

    }
}
