package ExceptionHandling;

import java.util.Scanner;

class PhnNumException extends Exception{
    PhnNumException(String str){
        super(str);
    }
}
class StoreData {
    void display(String phNo) throws PhnNumException {

        if (phNo.length() != 10)
            throw new PhnNumException("The Given number is not valid");
        else
            System.out.println("Phno is Valid");

    }
}

    public class Custom {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            StoreData sd = new StoreData();
            try {
                System.out.println("Enter your Num: ");
                String phNo = in.nextLine();
                sd.display(phNo);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

