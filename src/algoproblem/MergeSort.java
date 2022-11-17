package q5mergesort;

public class MergeSort {
    int array[];
    int tempMergeArr[];
    int length;

    public static void main(String[] args) {
        /**
         * Input array
         */
        int inputArr[] = { 50, 35, 13, 55, 16, 91, 25 };
        /**
         * object of MergeSort class to call sort method
         */
        MergeSort ms = new MergeSort();
        /**
         * passed array in sort method to sort array
         */
        ms.sort(inputArr);
        /**
         * Print the array
         */
        for (int i : inputArr) {
            System.out.println(i + " ");
        }
    }

    public void sort(int inputArr[]) {
        this.array = inputArr;
        this.length = inputArr.length;
        this.tempMergeArr = new int[length]; // temporary array
        divideArray(0, length - 1);
    }

    public void divideArray(int lowerIndex, int higherIndex) {
        if (lowerIndex < higherIndex) {

            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            // it will sort the left side of array using recursion
            divideArray(lowerIndex, middle);

            // It will sort right side of array using recursion method
            divideArray(middle + 1, higherIndex);

            mergeArray(lowerIndex, middle, higherIndex);
        }
    }

    public void mergeArray(int lowerIndex, int middle, int higherIndex) {
        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergeArr[i] = array[i];
        }

        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {

            if (tempMergeArr[i] <= tempMergeArr[j]) {
                array[k] = tempMergeArr[i];
                i++;
            }

            else {
                array[k] = tempMergeArr[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = tempMergeArr[i];
            k++;
            i++;
        }
    }
}
