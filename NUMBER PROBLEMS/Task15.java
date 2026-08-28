import java.util.Scanner;

public class Task15 {

    public static int perfect(int n1){
        int sum = 0;
        for(int i =1;i<n1;i++){
            if(n1 % i == 0){
                sum += i;
            }
        }return sum;

    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value:");
        int n1 = sc.nextInt();

        int val = perfect(n1);
        System.out.println("PERFECT VAL:" + val);
        if(val == n1){
            System.out.println("THE NUM IS PERFECT!");

        }
        else{
            System.out.println("NOT A PERFECT!");
        }
    }
    
}
