package ExceptionHandling;

import java.io.File;
import java.io.FileReader;

public class Task1 {
    public static void main(String[] args) {
        int [] arr = new  int[4];
        try{
            System.out.println(arr[5]);
        }catch (ArrayIndexOutOfBoundsException ae){
            arr = new int[10];
            System.out.println(arr[5]);
        }finally {
            System.out.println("Executed!!");
        }
    }
}
