package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a string");
        String string1 = scan.nextLine();
        System.out.println("Please enter another string");
        String string2 = scan.nextLine();

        boolean isRotated;


        if (rotateString(string1, string2)) {
            System.out.println(string1 + " and " + string2 + " are in rotation with each other.");
            isRotated = true;
        } else {
            System.out.println("Sorry, " + string1 + " and " + string2 + " are not in rotation with each other.");
            isRotated = false;
        }

        scan.close();
    }

    public static boolean rotateString(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        } else if ((str1 + str1).contains(str2)){

                return true;
        }
        return false;
    }
}
