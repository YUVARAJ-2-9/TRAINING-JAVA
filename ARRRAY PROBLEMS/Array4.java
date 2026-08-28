import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        int [] arr = new int[size];
        System.out.println("Array values:" );

        for(int i =0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        for(int i =0;i<arr.length;i++){
            if(arr[i] < min){
                min = arr[i];

            }
        }
        System.out.println("MINIMUM VALUES: " + min);

    }
}
