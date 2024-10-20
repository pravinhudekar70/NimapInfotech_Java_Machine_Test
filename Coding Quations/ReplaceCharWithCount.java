public class ReplaceCharWithCount {
    public static void main(String[] args) {
        String name = "Programming";
        char ch = 'r';
        // output: P1og2amming
        char arr[] = name.toCharArray();
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ch) {
                arr[i] = String.valueOf(count).charAt(0);
                count++;
            }
        }
        System.out.println(new String(arr));
    }
}
