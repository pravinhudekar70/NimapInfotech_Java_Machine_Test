import java.util.ArrayList;
import java.util.List;

public class LongestSubstringNonReapChar {

    public static void main(String[] args) {
        // input1
        // String s = "abbac";
        // input2
        // String s = "abcabcbbxcvdfg";

        // ArrayList<Character> al = new ArrayList<>();
        // int maxLength = 0;
        // String longestSub = "";

        // for (int i = 0; i < s.length(); i++) {
        // char ch = s.charAt(i);
        // if (al.contains(ch)) {
        // while (al.contains(ch)) {
        // al.remove(0);
        // }
        // }
        // al.add(ch);
        // if (al.size() > maxLength) {
        // maxLength = al.size();
        // longestSub = al.toString();
        // }
        // }
        // System.out.println("Longest non-repeating substring: " + longestSub);
        // System.out.println("Length: " + maxLength);

        String s = "abcabcbbxcvdfg";
        List<Character> al = new ArrayList<>();
        String longString = "";
        int maxInt = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (al.contains(ch)) {
                while (al.contains(ch)) {
                    al.remove(0);
                }
            }
            al.add(ch);
            if (maxInt < al.size()) {
                maxInt = al.size();
                longString = al.toString();
            }
        }
        System.out.println(longString);
        System.out.println(maxInt);
    }
}
