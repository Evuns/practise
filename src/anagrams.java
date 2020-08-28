import java.util.Arrays;
import java.util.Scanner;

public class anagrams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstWord = scanner.nextLine();
        String secondWord = scanner.nextLine();

        if (firstWord.length() != secondWord.length()) {
            System.out.println("Not anagrams!");
        } else {
            char[] first = firstWord.toCharArray();
            Arrays.sort(first);

            char[] second = secondWord.toCharArray();
            Arrays.sort(second);

            System.out.println(Arrays.equals(first, second));
        }
    }

}
