import java.util.Scanner;

public class Task17 {

    public static int auto(int n1){
        int sqr = n1 * n1;

        int ltd = 0;
        while(sqr > 0){
             ltd = sqr % 100;
            System.out.println("LAST TWO DIGIT:" + ltd);
            break;
        }
        if(n1 == ltd){
            System.out.println(sqr  + "AUTOMORPHIC NUMBER");
        }
        else{
            System.out.println(sqr + "NOT A AUTOMORPHIC NUMBER!");
        }return sqr;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value:");
        int n1 = sc.nextInt();

        int val = auto(n1);
        System.out.println("AUTOMORPHIC NUMBER:" + val);
    }
    
}
