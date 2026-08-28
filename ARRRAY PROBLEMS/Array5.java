import java.util.Scanner;

public class Array5 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        int [] arr = new int[size];
        System.out.print("Array values:");

        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        avg(arr);
        
    }

    public static int [] avg(int [] arr){
        int sum = 0;

        for(int i =0;i<arr.length;i++){
            sum += arr[i];
        }
        System.out.println(sum);
        int avg = sum / arr.length;
        System.out.println("AVERAGE VALUE: " + avg);
      return arr;
    }
}
