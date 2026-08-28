package Strings;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String emp = "";
        for (int i = 0; i < str.length(); i++) {
            emp += str.charAt(i) + " ";
        }
        System.out.println(emp);
    }
}
