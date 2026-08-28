import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Array row size:");
        int n = in.nextInt();
        System.out.println("col size:");
        int n1 = in.nextInt();
        int [] [] arr = new int [n] [n1];
        System.out.println("Enter 2d arr values:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n1; j++) {
                arr[i] [j] = in.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n1; j++) {
                System.out.print((arr[i][j] + " "));
            }
            System.out.println();
        }
    }
}
