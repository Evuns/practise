import java.util.Random;

public class upsAndDowns {
    private static final Random random = new Random();
    static int num = random.nextInt(1000);
    static int counter = 0;

    public static void main(String[] args) {

        guess(500, 1, 1000);
        System.out.println(counter);
    }

    private static int guess(int x, int begin, int end) {
        if (x == num) {
            counter++;
            return 0;
        } else if (x > num) {
            end = x - 1;
        } else {
            begin = x + 1;
        }
            counter++;
            return guess((begin + end) / 2, begin, end);
    }
}
