import java.util.Scanner;

public class Task13 {

    public static int binary ( int n1){
        int sum = 0;
        int exp = 0;
        while(n1 > 0){
            int ld = n1 % 10;
            sum += ld * (int)Math.pow(2, exp);
            exp++;
            n1 /= 10;

        }return sum;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value:");
        int n1 = sc.nextInt();

        int val = binary(n1);
        System.out.println("BINARY VAL:" + val);
    }
    
}
