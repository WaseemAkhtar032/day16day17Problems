package q2binarysearch;

public class BinarySearch {
    static int binarySearch(String[] arr, String word) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {

            int mid = left + (right - left) / 2;
            int res = word.compareTo(arr[mid]);
            if (res == 0)
                return mid;
            if (res > 0)
                left = mid + 1;
            else
                right = mid - 1;

        }
        return -1;
    }

    public static void main(String[] args) {

        String[] arr = { "Wasee", "ansari", "ans", "Dhule" };

        String word = "ansari";
        int result = binarySearch(arr, word);
        if (result == -1)
            System.out.println("Word is not present");
        else
            System.out.println("Word Fount at " + "index " + result);

    }
}
