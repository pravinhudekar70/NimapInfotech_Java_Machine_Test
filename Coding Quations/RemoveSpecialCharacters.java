public class RemoveSpecialCharacters {
    public static void main(String[] args) {
        String str = "Hello+- ^Java+ -Programmer^ ^^-- ^^^ +!";

        // //way1
        // String s = "";
        // for (int i = 0; i < str.length(); i++) {
        // if (Character.isAlphabetic(str.charAt(i)) ||
        // Character.isWhitespace(str.charAt(i))) {
        // s = s + str.charAt(i);
        // }
        // }
        // System.out.println(s);

        // way 2 using repalceAll()
        str = str.replaceAll("[^a-zA-Z0-9' ']", "");
        System.out.println(str);
    }

}
