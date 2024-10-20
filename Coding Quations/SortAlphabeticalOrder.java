import java.util.Arrays;

public class SortAlphabeticalOrder {
    public static void main(String[] args) {
        String name = "asdfghjklmnbvcxzqwertyuiop";
        name = name.toLowerCase();
        char arr[] = name.toCharArray();
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = i + 1; j < arr.length; j++) {
        // if (arr[i] > arr[j]) {
        // char temp = arr[i];
        // arr[i] = arr[j];
        // arr[j] = temp;
        // }
        // }
        // }
        // System.out.println(new String(arr));

        // way2 using Arrays.sort() method
        Arrays.sort(arr);
        System.out.println(new String(arr));
    }
}
