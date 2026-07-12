import java.util.Scanner;

public class Task14 {

    public static int strong(int n1){
        
        int sum = 0;
        while(n1 > 0){

            int ld = n1 % 10;
            int fact = 1;

            for(int i =1; i<=ld;i++){
                fact *= i;
                  }
            sum += fact;
            n1 /= 10;
        }return sum;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value:");
        int n1 = sc.nextInt();

        int val = strong(n1);
        System.out.println("STRONG NUM:" + val);
        if(val == n1){
            System.out.println("The num is Strong Number!");
        }
        else{
            System.out.println("Not a Strong num!");
        }
        
    }
    
}
