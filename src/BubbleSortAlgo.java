import java.util.Arrays;

public class BubbleSortAlgo {
    static void bubble(int[] arr){
        for (int i = 0; i < arr.length; i++) {

//            iterator works as counter for array which runs n-1 times

            for (int j = 1; j <= arr.length - i - 1; j++) {

                if(arr[j] < arr[j - 1]){
//                    int temp;
//                    temp = arr[j];
//                    arr[j] = arr[j - 1];
//                    arr[j - 1] = temp;
                    swap(arr, j, j-1);
                }
            }
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,5,32,223,45,1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
}
