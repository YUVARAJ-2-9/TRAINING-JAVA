import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value:");
        int n1 = sc.nextInt();

        System.out.println("Enter the value:");
        int n2 = sc.nextInt();

        int n3 = n1;
        n1 = n2;
        n2 = n3;

        System.out.println("After Swapping n1 :" + n1);
        System.out.println("After Swapping n2 :" + n2);


    }
    
}
