import java.util.Arrays;

public class EqualTwoArray {
    public static void main(String[] args) {
        int a1[] = { 3, 5, 1, 2, 6, 8, 7, 4 };
        int a2[] = { 7, 2, 1, 5, 4, 8, 3, 6 };
        //// way1 using Arrays class methods
        // Arrays.sort(a1);
        // Arrays.sort(a2);
        // if (Arrays.equals(a1, a2))
        // System.out.println("Arrays is equals");
        // else
        // System.out.println("Arrays is not equals");

        // way2
        boolean check = false;
        if (a1.length == a2.length) {

            for (int i = 0; i < a1.length; i++) {
                boolean temp = false;
                for (int j = 0; j < a1.length; j++) {
                    if (a1[i] == a2[j])
                        temp = true;
                }
                if (temp != check)
                    check = temp;
            }

        } else
            System.out.println("Arrays is not Equals");
        if (check)
            System.out.println("Arrays is equals");
        else
            System.out.println("Arrays is not equals");
    }
}
