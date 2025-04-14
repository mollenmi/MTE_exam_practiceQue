public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                // Reduce prefix length
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        String[] words = {"flower", "flow", "flight"};
        String result = longestCommonPrefix(words);
        System.out.println("Longest Common Prefix: " + result);
    }
}
