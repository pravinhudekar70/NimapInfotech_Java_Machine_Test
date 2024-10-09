public class Patterns {
    public static void main(String[] args) {
        /*
         * 2
         * 4 4
         * 6 6 6
         * 8 8 8 8
         */
        // int n = 4;
        // int temp = 2;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(temp + " ");
        // }
        // temp += 2;
        // System.out.println();
        // }

        /*
         * 1 2 3 4 5 * * * * *
         * 11 12 13 14 15 * * * * *
         * 21 22 23 24 25 * * * * *
         * ....
         * 91 92 93 94 95 * * * * *
         */
        int n = 10;
        int temp = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= 5)
                    System.out.print(temp + " ");
                else
                    System.out.print("* ");
                temp++;
            }
            System.out.println();
        }

    }
}
