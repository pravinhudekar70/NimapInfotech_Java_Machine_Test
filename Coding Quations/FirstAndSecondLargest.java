import java.util.Arrays;

public class FirstAndSecondLargest {
    public static void main(String[] args) {
        int arr[] = { 3, 5, 9, 34, 7, 1, 2, 6, 8 };

        // // way 1 using Arrays.sort
        // Arrays.sort(arr);
        // System.out.println("First largest: " + arr[arr.length - 1] + " Secount
        // Largest: " + arr[arr.length - 2]);

        int larg = Integer.MIN_VALUE;
        int slarg = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > larg)
                larg = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] > slarg) && (arr[i] < larg))
                slarg = arr[i];
        }
        System.out.println("First largest: " + larg + " Secount Largest: " + slarg);
    }
}
