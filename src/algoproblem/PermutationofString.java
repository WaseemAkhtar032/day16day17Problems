package q1permutationofstring;

public class PermutationofString {
    static void swap(char chars[], int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;

    }
    public static void permutation(char chars[], int currentIndex) {
        if (currentIndex == chars.length - 1) {
            System.out.println(String.valueOf(chars));
        }
        for (int i = currentIndex; i < chars.length; i++) {
            swap(chars, currentIndex, i);
            permutation(chars, currentIndex + 1);
            swap(chars, currentIndex, i);
        }
    }

    public static void findPermutation(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        permutation(str.toCharArray(), 0);
    }


    public static void main(String[] args) {
        String str = "ABC";
        findPermutation(str);
    }

}
