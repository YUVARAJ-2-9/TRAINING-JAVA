import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value:");
        int n = sc.nextInt();
        for (int i = 1; i <=  n; i++) {
            for (char j = 'A'; j <= 'A' + (n-i); j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
