package Pattern;

public class Pattern {
    public static void main(String[] args) {

        for(int i=0; i<=5;i++){

            for(int j=1; j<=i;j++){

                System.out.print("*"+"\t");

            }
            System.out.println();
        }


        for(int i=1;i<5;i++){
            for(int j=5-i;j>=0;j--){
                System.out.print("*"+"\t");
            }
            System.out.println();
        }

// hollow right angled triangle
        System.out.println("***** ____ *****");

        int totalrow = 5;

        for(int row = 1; row <= totalrow; row++)
        { for (int col = 1; col <= row; col++)
        { if (col == 1 || col == row || row == totalrow)
        { System.out.print(col);
        } else { System.out.print(" ");
        }
        } System.out.println();
        }

    }









}
