package arraypractice;

public class FindMissingNumberInArrays {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 7};

        int n = arr.length + 1;

        int expectedsum = n*(n+1)/2;
        int actualsum =0;

        for(int num:arr){
            actualsum +=num;

        }
        int missingnumber = expectedsum - actualsum;
        System.out.println("Missing number is: " + missingnumber);

    }

}
