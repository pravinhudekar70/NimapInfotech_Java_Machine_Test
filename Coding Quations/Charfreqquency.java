import java.util.*;

public class Charfreqquency {
    public static void main(String[] args) {
        // String str = "hellow dear my name is pravin";
        String str = "Engineering";
        str = str.toLowerCase();
        Map<Character, Integer> map = new HashMap<>();
        // // Way1 using map
        // char chArr[] = str.toCharArray();
        // for (char ch : chArr) {
        // if (!map.containsKey(ch)) {
        // map.put(ch, 1);
        // } else {
        // map.put(ch, map.get(ch) + 1);
        // }
        // }
        // System.out.println(map);

        // // Way2 using map
        // for (int i = 0; i < str.length(); i++) {
        // if (str.charAt(i) != ' ') {
        // if (!map.containsKey(str.charAt(i))) {
        // map.put(str.charAt(i), 1);
        // } else {
        // map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
        // }
        // }
        // }
        // for (char s : map.keySet()) {
        // System.out.println(s + "=> " + map.get(s));
        // }

        // way 2 using Arrays
        int freq[] = new int[str.length()];
        char ch[] = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            freq[i] = 1;
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    freq[i] = freq[i] + 1;
                    ch[j] = '0';
                }
            }
        }
        System.out.println(String.valueOf(ch));
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != ' ' && ch[i] != '0') {
                System.out.println(ch[i] + "=>" + freq[i]);
            }
        }

    }
}
