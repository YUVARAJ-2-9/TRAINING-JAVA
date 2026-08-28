import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Multi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Matrix A");
        System.out.println("Enter the row size");
        int row1 = in.nextInt();
        System.out.println("Enter the col size :");
        int col1 = in.nextInt();;
//        -------------------------
        System.out.println("Matrix B");
        System.out.println("Enter the row Size:");
        int row2 = in.nextInt();
        System.out.println("Enter the col size:");
        int col2 = in.nextInt();

        int [] [] mat1 = new int[row1][col1];
        int [] [] mat2 = new int[row2][col2];
        int [] [] out = new int[row1][col2];

        if(col1 != row2){
            System.out.println("erro!!!!!!!");
        }

        System.out.println("enter Array1 value");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                mat1 [i][j] = in.nextInt();
            }
        }
        System.out.println("enter the Array2 values:");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                mat2[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                for (int k = 0; k < col1; k++) {
                    out[i][j] += mat1[i][k]*mat2[k][j];
                }
            }
        }
        System.out.println(Arrays.deepToString(out));



    }
}
