public class MissingNumber {

    public static void main(String[] args) {
        int arr[] = { 1, 5, 6, 8, 2, 7, 3, 4, 10 };
        int sum = 0;
        // //using formula
        // int total = 10 * (10+1) / 2;
        // for (int i : arr) {
        // sum += i;
        // }
        // System.out.println(total - sum);

        int a[] = new int[arr.length + 2];
        for (int i = 0; i < arr.length; i++) {
            a[arr[i]] = 1;
        }
        for (int i = 1; i < a.length; i++) {
            if (a[i] == 0) {
                System.out.print(i);
            }
        }

    }
}