import java.util.Scanner;

public class Task12 {
    public static String decimal(int n1){
        String binary = "";
        while(n1 > 0){
            int div = n1 / 2;
            int rem = n1 % 2;
            n1 = div;
            binary = rem + binary;
            
        }return binary ;

       
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value:");
        int n1 = sc.nextInt();

        String val = decimal(n1);
        System.out.println("DEC VAL :  " + val);

        

        
    }
}
