import java.util.Scanner;

public class Task18 {

    public static int harshad(int n1){
        int sum = 0;
        int temp = n1;
        while(temp > 0){
            int ld = temp % 10;
            sum += ld;
            temp /= 10;
            

        }
        if(n1 % sum == 0){
            System.out.println("HARSHAD NUMBER1");
        }
        else{
            System.out.println("Not a Harshad number");
        }return sum;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value:");
        int n1 = sc.nextInt();

        int val = harshad(n1);
        System.out.println("HARSHAD VAL:" + val);

    }
    
}
