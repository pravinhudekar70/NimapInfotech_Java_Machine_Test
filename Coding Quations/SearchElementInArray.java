import java.util.Arrays;

public class SearchElementInArray {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 9, 1, 3, 5, 7 };
        int n = 2;
        boolean check = true;

        //// using lenear search
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] == n) {
        // System.out.println(n + " fount at index:" + i);
        // check = false;
        // }
        // }

        // using binary search
        Arrays.sort(arr);
        int s = 0;
        int e = arr.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == n) {
                System.out.println(n + " found");
                check = false;
                break;
            } else if (arr[mid] > n) {
                e = mid - 1;
            } else
                s = mid + 1;
        }

        if (check)
            System.out.println(n + " Not found in array");
    }
}
