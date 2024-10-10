public class LargestBetn3Num {
    public static void main(String[] args) {
        int a = 2000, b = 4500, c = 1200;

        // // way 1
        // if (a > b)
        // if (a > c)
        // System.out.println(a + " is largest");
        // if (b > a)
        // if (b > c)
        // System.out.println(b + " is largest");
        // if (c > a)
        // if (c > b)
        // System.out.println(c + " is largest");

        // // way 2
        // if (a > b && a > c)
        // System.out.println(a + "is largest Number");
        // else if (b > a && b > c)
        // System.out.println(b + " is largest Number");
        // else
        // System.out.println(c + " is largest Number");

        // way 3 using Math.max()function
        int num0 = Math.max(a, Math.max(b, c));
        System.out.println(num0);

        // way 4 using ternary operator
        int num = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        System.out.println(num);
    }
}
