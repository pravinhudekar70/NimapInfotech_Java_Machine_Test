public class LongestWord {
    public static void main(String[] args) {
        String str = "Hello every one good morning have a nice day";
        String s[] = str.split(" ");
        int len = 0;
        int idx = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i].length() > len) {
                len = s[i].length();
                idx = i;
            }
        }
        System.out.println(s[idx]);
    }
}
