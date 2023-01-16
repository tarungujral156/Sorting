import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {9,234,2345,2354,2345,425,1};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertionSort(int[] arr){
        for (int itr = 0; itr < arr.length - 1; itr++) {

            for (int innerItr = itr + 1; innerItr > 0; innerItr--) {

                if(arr[innerItr - 1] > arr[innerItr]){
                    swap(arr, innerItr, innerItr - 1);
                }else {
                    break;
                }
            }
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
