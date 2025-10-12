package arraypractice;

class ArrayReverser{

    public static void main (String args[]){

        int [] a ={3,4,6,39,56,34,45,66};

        int size=a.length;

        for( int i=size-1;i>=0;i--){

            System.out.print((a[i]) + "\t");

        }
        System.out.println();

        int[] b= new int[size];
        for(int i=0;i<size;i++){
            b[i]=a[i];
            System.out.print(b[i] +"\t");
        }
    }
}
