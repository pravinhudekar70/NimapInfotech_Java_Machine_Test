import java.util.Arrays;

public class SortArray {
    // using bubble sort
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 9, 1, 3, 5, 7 };
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
