package arraypractice;

public class SumOfArrayInt {
    public static void main(String[] args) {

        int [] arr ={-3,-2,0,-7,24,12,-1};

        int sum =0;
        int count =0;

        for(int i=0;i<arr.length;i++){
            //if(arr[i]>0){
                sum+=arr[i];
                count++;

          //  }
        }
        System.out.println("sum of  number is "+ sum);
        if(count>0){
            int average = sum/count;
            System.out.println("average of positive number is "+ average);
        }else {
            System.out.println("no positive number found");
        }


    }
}
