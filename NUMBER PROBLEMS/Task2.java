import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value:");
        int n = sc.nextInt();
        int rev = 0;
        int temp = n;


        while(n > 0){
            int ld = n % 10;
            rev = (rev*10) + ld;
            n /= 10;
            

        }
        if(temp == rev){
            System.out.println("It is palindrome!");
        }
        else{
            System.out.println("Not palindrome!");
        }
    }
    
}
