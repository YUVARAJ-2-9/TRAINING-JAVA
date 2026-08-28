import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value:");
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        int count =0 ;

        while(temp > 0){
            count++;
            temp /= 10;
        }
        

        temp = n;

        while(temp > 0){
            int ld = temp % 10;
            int res = (int)(Math.pow(ld, count));
            sum += res;
            temp /= 10;
            System.out.println(res);
            

        }
        
        if(n == sum){
            System.out.println(sum + "Arm Number!");
        }
        else{
            System.out.println(sum + "Not a arm number!");
        }
    }
}
