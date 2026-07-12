import java.util.Scanner;

public class Task11 {

    public static int count(int n1){
        int count = 0;
        while(n1 > 0){
            int rem = n1 % 10;
            count++;
            n1 /= 10;
        }return count;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value:");
        int n1 = sc.nextInt();

        int val = count(n1);
        System.out.println("COUNT VAL :" + val);


        
    }
    
    
}
