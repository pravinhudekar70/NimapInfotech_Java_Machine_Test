import java.util.*;

public class RemoveDuplicateChar {
    public static void main(String[] args) {
        String s = "programming";
        String str = "";

        // // way1 using LinkedHashSet
        // Set<Character> hs = new LinkedHashSet<>();
        // for (int i = 0; i < s.length(); i++) {
        // hs.add(s.charAt(i));
        // }
        // for (char ch : hs) {
        // str = str + ch;
        // }
        // System.out.println(str);

        // // way2 using indexOf() method of String class
        // for (int i = 0; i < s.length(); i++) {
        // int idx = s.indexOf(s.charAt(i), i + 1);
        // if (idx == -1) {
        // str += s.charAt(i);
        // }
        // }
        // System.out.println(str);

        // way3 using Character array
        char arr[] = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            boolean check = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    check = true;
                }
            }
            if (!check) {
                str += arr[i];
            }
        }
        System.out.println(str);

    }
}
