import java.util.Arrays;

public class AnagramString {
    public static void main(String[] args) {
        String s1 = "asdfghjkl";
        String s2 = "lkjhgfds";

        if (s1.length() != s2.length()) {
            System.out.println("not anagram string");
        } else {
            // way1 using arrays.sort() method
            // char ch1[] = s1.toCharArray();
            // Arrays.sort(ch1);
            // s1 = new String(ch1);
            // char ch2[] = s2.toCharArray();
            // Arrays.sort(ch2);
            // s2 = new String(ch2);
            // if (s1.equals(s2))
            // System.out.println("yes is anagram String");
            // else
            // System.out.println("not anagram string");

            // way2 using freq array

            int freq[] = new int[256];
            for (int i = 0; i < s1.length(); i++) {
                char ch = s1.charAt(i);
                freq[ch] += 1;
            }
            for (int i = 0; i < s1.length(); i++) {
                char ch = s1.charAt(i);
                freq[ch] -= 1;
            }
            boolean chek = true;
            for (int i : freq) {
                if (i != 0)
                    chek = false;
            }
            if (chek)
                System.out.println("yes it is anagram string");
            else
                System.out.println("not anagram string");

        }

    }
}
