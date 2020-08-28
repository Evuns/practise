import java.util.Arrays;

public class countPermutations {


    static int permutations(String s, String b) {
        int counter = 0;
        char [] lookingFor = s.toCharArray();
        char [] lookingInto = b.toCharArray();

        Arrays.sort(lookingFor);
        for (int i = 0; i <= lookingInto.length - lookingFor.length; i++) {
            char [] comparing = new char[lookingFor.length];
            for (int j = 0; j < comparing.length; j++) {
                comparing[j] = lookingInto[i + j];
            }
            Arrays.sort(comparing);
            if(Arrays.equals(lookingFor, comparing)){
                counter++;
                i += lookingFor.length - 1;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        String s = "abb";
        String b = "ababababbbaaahdihdjaisdjcanlkabba";
        System.out.println(permutations(s, b));
    }
}
