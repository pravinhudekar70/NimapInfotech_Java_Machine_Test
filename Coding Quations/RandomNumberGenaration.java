import java.util.Random;

public class RandomNumberGenaration {
    public static void main(String[] args) {
        Random rs = new Random();
        for (int i = 1; i <= 10; i++) {
            System.out.println(rs.nextInt(100));
            // using Math.random() but it return only decimal value
            // System.out.println(Math.random() * 100);
        }
    }
}
