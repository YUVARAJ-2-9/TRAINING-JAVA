import java.util.Scanner;

public class Array6 {
    public static void main(String[] args) {
        int [] arr = {1 ,2, 3, 4, 5, 6};
        count(arr);
    }
    public static int [] count(int [] arr){
        int e =  0;
        int o =  0;
        
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0){
                e++;
            }
            else{
                o++;

            }
        }
        System.out.println("EVEN:" + e);
        System.out.println("ODD: " + o);
return arr;
    }
    
}
