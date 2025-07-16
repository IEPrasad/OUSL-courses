public class KMPAlgorithm {
    // Build prefix table (LPS array)
    int[] buildLPS(String pattern) {
        int m = pattern.length();
        int[] lps = new int[m];
        int len = 0, i = 1;

        while (i < m) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i++] = len;
            } else {
                if (len != 0) len = lps[len - 1];
                else lps[i++] = 0;
            }
        }

        return lps;
    }

    // KMP search
    void search(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();
        int[] lps = buildLPS(pattern);

        int i = 0, j = 0;

        System.out.print("Pattern found at indices: ");
        while (i < n) {
            if (pattern.charAt(j) == text.charAt(i)) {
                i++;
                j++;
            }

            if (j == m) {
                System.out.print((i - j) + " ");
                j = lps[j - 1];
            } else if (i < n && pattern.charAt(j) != text.charAt(i)) {
                if (j != 0) j = lps[j - 1];
                else i++;
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        KMPAlgorithm kmp = new KMPAlgorithm();
        String text = "abxabcabcaby";
        String pattern = "abcaby";
        kmp.search(text, pattern); // Should print: 6
    }
}
