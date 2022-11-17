package q4bubblesort;

public class BubbleSort {
    static void bubbleSort(int arr[]) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - 1); j++) {
                if (arr[j - 1] > arr[j]) {

                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {


        int arr[] = { 4, 20, 3, 9, 70, 6, 1, 20 };
        System.out.println("Array Before Bubble sort");

        for (int i = 0; i < arr.length; i++) {
            System.out.print("\t" + arr[i] + " ");
        }
        System.out.println();

        bubbleSort(arr);

        System.out.println("Array After Bubble sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\t" + arr[i] + " ");

        }
    }
}
