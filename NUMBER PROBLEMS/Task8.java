import java.util.Scanner;

public class Task8 {

    public static int getGCD(int n1,int n2){
        while(n2 != 0){
            int rem = n1 % n2;
            n1 = n2;
            n2 = rem ;


        }
        
        return n1 ;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value:");
        int n1 = sc.nextInt();

        System.out.println("Enter the value:");
        int n2 = sc.nextInt();

        
        System.out.println(getGCD(n1, n2));


        

       
        

       

        }
        
        


    }

