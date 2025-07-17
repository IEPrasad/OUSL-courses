import java.util.*;

public class SuffixArray {
    public static String[] buildSuffixArray(String text) {
        int n = text.length();
        String[] suffixes = new String[n];

        for (int i = 0; i < n; i++) {
            suffixes[i] = text.substring(i);
        }

        Arrays.sort(suffixes); // Lexicographical sort
        return suffixes;
    }

    // Main
    public static void main(String[] args) {
        String text = "banana";
        String[] suffixArr = buildSuffixArray(text);

        System.out.println("Suffix Array:");
        for (String s : suffixArr) {
            System.out.println(s);
        }
    }
}
