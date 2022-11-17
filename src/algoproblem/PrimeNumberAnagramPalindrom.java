package q8primenumberanagrampalindrom;

import java.util.ArrayList;

public class PrimeNumberAnagramPalindrom {
    static ArrayList<Integer> arrayList = new ArrayList<>();
    static ArrayList<Integer> arrayList2 = new ArrayList<>();

    public static void main(String[] args) {


        final int startRange = 0;
        final int endRange = 1000;

        primePrint(startRange, endRange);
    }

    /**
     * created method to check the number is prime or not
     *
     * @param num - Number have to checked
     * @return- true if prime else false
     */
    public static boolean isPrime(Integer num) {

        if (num == 0 || num == 1)
            return false;
        for (int i = 2; i <= num; i++) {

            if (num % i == 0) {
                if (i == num) {
                    isPalindrome(num);
                    if (isPalindrome(num)) {
                        arrayList2.add(num);
                    }
                } else {
                    return false;
                }
            }

        }
        return true;
    }

    /**
     * Create a isPalindrom method to check whether the prime no. is palindrome or not
     *
     * @param num - to check the number
     * @return - true if it is Palindrome
     */
    public static boolean isPalindrome(Integer num) {
        int r, sum = 0;

        int orn = num;
        while (num > 0) {
            r = num % 10;
            sum = (sum * 10) + r;
            num = num / 10;
        }
        if (orn == sum) {
            return true;
        } else {
            return false;
        }
    }

    private static void primePrint(int startRange, int endRange) {
        System.out.println("Prime numbers from  " + startRange + " to " + endRange + " are :");
        for (int range = startRange; range <= endRange; range++) {
            if (isPrime(range)) {
                arrayList.add(range);
            }
        }
        System.out.println(" Prime numbers are : " + arrayList);
        System.out.println("\n Prime Anagram and Palindrome numbers are : " + arrayList2);
    }
}
