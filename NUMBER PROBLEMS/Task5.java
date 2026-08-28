import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value:");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        

        System.out.println("A:" + a);
        System.out.println("B:" + b);
        
        for(int i = 3; i<=n;i++){
            int c = a+b;
            System.out.println("C:" + c);
            
            a = b;
            b = c;
            
        }
        System.out.println();
        

    }
    
}
