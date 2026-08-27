import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        int [] arr = new int[size];
        int sum  = 0;

        for(int i =0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0 ;i < arr.length;i++){
            sum += arr[i];

        }
        System.out.print("SUM: "+ sum);
    }
    
}
