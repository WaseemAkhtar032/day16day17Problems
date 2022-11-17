package Palindrom;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Palindrom {
    static Scanner sc = new Scanner(System.in);
    /*
     * Declared a queue to store a reversed string
     */
    static Queue<Character> queue = new LinkedList<>();

    public static void main(String[] args) {

        /**
         * Taking String from user to check palindrome or not
         */
        do {

            System.out.print("Enter string to check Palindrome or not : ");
            String inputString = sc.next();

            /*
             * reversing a user input string
             */
            for (int i = inputString.length() - 1; i >= 0; i--) {
                queue.add(inputString.charAt(i));
            }

            String reverseString = "";

            /*
             * checking user input with reverse string
             */
            while (!queue.isEmpty()) {
                reverseString = reverseString + queue.remove();
            }
            if (inputString.equals(reverseString)) {
                System.out.println("The input is a palindrome.");
            }
            else {
                System.out.println("The input not a palindrome.");
                break;
            }
        }while(true);
    }

}
