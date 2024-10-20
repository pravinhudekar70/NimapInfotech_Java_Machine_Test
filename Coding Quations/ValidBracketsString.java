import java.util.Stack;

public class ValidBracketsString {
    static boolean validCheck(String str) {
        Stack<Character> sk = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (sk.empty())
                sk.push(ch);
            else if (ch == '{' || ch == '[' || ch == '(')
                sk.push(ch);
            else if ((ch == '}' && sk.peek() == '{') || (ch == ']' && sk.peek() == '[')
                    || (ch == ')' && sk.peek() == '('))
                sk.pop();
            else {
                return false;
            }
        }
        if (sk.isEmpty())
            return true;

        return false;
    }

    public static void main(String[] args) {
        String str = "{[({})]}{}}";
        if (validCheck(str))
            System.out.println("Yes, String have valid brackets");
        else
            System.out.println("No,String have'nt valid brackets ");
    }
}
