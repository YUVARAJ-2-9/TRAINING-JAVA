import java.util.Arrays;
import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the row size:");
        int n = in.nextInt();
        System.out.println("Enter the col size:");
        int n1 = in.nextInt();
        int arr1[] [] = new int[n][n1];
        int [] [] arr2 = new int [n][n1];
        System.out.println("Enter aar1 values:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n1; j++) {
                arr1[i][j] = in.nextInt();
            }
        }
        System.out.println("Enter the arr2 values:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n1; j++) {
                arr2[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n1; j++) {
                 arr1[i][j]= arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println(Arrays.deepToString(arr1));

    }
}
