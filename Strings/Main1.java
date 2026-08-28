package Strings;

import java.util.Scanner;

public class Main1+{
    static String reverseString(String str){
        String rev = "";
        for (int i = str.length()-1; i >= 0 ; i--) {
            rev += str.charAt(i) + "";
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(Main1.reverseString(str));
    }
}
