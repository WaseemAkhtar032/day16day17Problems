package q3insertionsort;

public class InsertionSort {
    static void insertionSort(String arr[], int n) {

        for (int i = 1; i < n; i++) {
            String temp = arr[i];

            int j = i - 1;
            while (j >= 0 && temp.length() < arr[j].length()) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }
    static void printList(String str[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(str[i] + " ");
        }
    }

    public static void main(String[] args) {

        String[] arr = { "I", "am", "Wasee", "Ansari" };
        int n = arr.length;
        insertionSort(arr, n);
        printList(arr, n);
    }

}
