import java.util.Arrays;

public class ReverseEachWord {
    public static void main(String[] args) {
        String s = "java code";
        String arr[] = s.split(" ");
        StringBuilder sb1 = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = arr[i].length() - 1; j >= 0; j--) {
                sb.append(arr[i].charAt(j));
            }
            sb1.append(sb);
            sb1.append(" ");
        }
        System.out.println(sb1.toString());
    }
}
