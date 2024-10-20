// import java.util.HashMap;
// import java.util.Map;
// import java.util.*;

// public class FirstNonRepeatingChar {
//     public static void main(String[] args) {
//         String str = "AABCDBEC";
//         for (int i = 0; i < str.length(); i++) {
//             boolean flag = true;
//             for (int j = 0; j < str.length(); j++) {
//                 if (i != j && str.charAt(i) == str.charAt(j)) {
//                     flag = false;
//                     break;
//                 }
//             }
//             if (flag) {
//                 System.out.println(str.charAt(i));
//                 break;
//             }
//         }
//         // using map;
//         Map<Character, Integer> map = new LinkedHashMap<>();

//         for (int i = 0; i < str.length(); i++) {
//             if (map.containsKey(str.charAt(i))) {
//                 map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
//             } else
//                 map.put(str.charAt(i), 1);

//         }
//         for (char ch : map.keySet()) {
//             if (map.get(ch) == 1) {
//                 System.out.println(ch);
//                 break;
//             }
//         }
//     }
// }

import java.util.Arrays;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String str = "AABCDBEC";
        int[] freq = new int[256]; // Array to store frequency of characters (ASCII range)

        // First pass: populate frequency array
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        // Second pass: find the first character with frequency 1
        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] == 1) {
                System.out.println(str.charAt(i));
                break;
            }
        }
    }
}
