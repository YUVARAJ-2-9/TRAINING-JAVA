import java.util.Scanner;

public class Task19 {
    public static int checkSpy(int n1){
        int sum =0 ;
        int pro = 1;
        int temp = n1;
        while (temp > 0) {
            int ld = temp % 10;
            sum += ld;
            pro *= ld;
            temp /= 10;

           
            
        }
         if(sum == pro){
                System.out.println("IT IS A SPY NUMBER!");
            }
            else{
                System.out.println("NOT A SPY NUMBER!");
            }return sum;

    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value:");
        int n1 = sc.nextInt();

        checkSpy(n1);
    }
    
}
