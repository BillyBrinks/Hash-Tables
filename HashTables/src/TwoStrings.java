import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Arrays;


public class TwoStrings {
	
	// Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {

        Set<Character> first = toCharSet(s1);
        Set<Character> second = toCharSet(s2);

        first.retainAll(second);

        if (first.size() > 0){
            return "YES";
        } else {
            return "NO";
        }
    }

    public static Set<Character> toCharSet(String word) {

    Set<Character> charSet = new HashSet<Character>();

    for (int i = 0; i < word.length(); i++){
        charSet.add(word.charAt(i));
    }

    return charSet;

}

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = scanner.nextLine();

            String s2 = scanner.nextLine();

            String result = twoStrings(s1, s2);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }

}
