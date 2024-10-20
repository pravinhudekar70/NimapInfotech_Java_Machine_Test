import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {

    public static void main(String[] args) {
        String s[] = { "java", "c", "c++", "python", "java", "c" };
        boolean flag = true;
        // //way1 using for loop
        // for (int i = 0; i < s.length; i++) {
        // for (int j = i + 1; j < s.length; j++) {
        // if (s[i].equals(s[j])) {
        // System.out.println(s[i] + " is Duplicate ");
        // flag = false;
        // }
        // }
        // }

        // way 2 using HashSet() class
        Set<String> set = new HashSet<>();
        for (int i = 0; i < s.length; i++) {
            if (!set.contains(s[i])) {
                set.add(s[i]);
            } else {
                System.out.println(s[i]);
                flag = false;
            }

        }

        if (flag) {
            System.out.println("Duplicate not found");
        }
    }
}