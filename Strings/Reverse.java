package Strings;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String rev = "";

        for (int i = str.length()-1; i >=0 ; i--) {
            rev += str.charAt(i) + "";
        }
        System.out.println(rev);
    }
}
