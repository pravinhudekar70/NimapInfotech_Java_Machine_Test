public class PalindromString {

    public static void main(String[] args) {
        String str = "nitin";
        str = str.toLowerCase();
        String s1 = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            s1 = s1 + str.charAt(i);
        }
        if (str.equals(s1))
            System.out.println(str + " is Palindrome");
        else
            System.out.println(str + " Not Palindrome");

        // // using StringBuilder
        // if (str.equals(new StringBuilder(str).reverse().toString()))
        // System.out.println(str + " is palindrome");
        // else
        // System.out.println(str + " not palindrome");
    }
}