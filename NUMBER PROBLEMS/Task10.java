import java.util.Scanner;

public class Task10 {

    public static int sum(int n1){
        int sum = 0;
       while(n1 > 0){
        int rem = n1 % 10;
        sum += rem;
        n1 /= 10;
       } return sum;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value:");
        int n1 = sc.nextInt();

        int val =sum(n1);
        System.out.println("SUM VAL :" + val);
    }
    
}
