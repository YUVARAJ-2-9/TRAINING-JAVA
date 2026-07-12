import java.util.Scanner;

public class Task16 {

    public static int happy(int n1){
        int sum = 0;
        while(n1 > 0){
            int ld = n1 % 10;
            int sqr = ld * ld;
            sum += sqr;
            n1 /= 10;
        }return sum ;
        

    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value:");
        int n1 = sc.nextInt();

        int val = happy(n1);
        System.out.println("HAPPY VAL:" + val);
    }
    
}
