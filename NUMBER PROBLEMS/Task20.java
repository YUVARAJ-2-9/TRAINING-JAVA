import java.util.Scanner;

public class Task20 {

    public static int neon(int n1){
        int sum = 0;
        int temp = n1;
        int sqr = temp * temp;
        
        while(sqr > 0){
            sum += sqr % 10;
            sqr /= 10;
        }
        if(sum == temp){
            System.out.println(sum + " IS NEON NUMBER");
        }
        else{
            System.out.println(sum + "IS NOT A NEON NUMBER");
        }return sum;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value:");
        int n1 = sc.nextInt();

        neon(n1);
        
    }
    
}
