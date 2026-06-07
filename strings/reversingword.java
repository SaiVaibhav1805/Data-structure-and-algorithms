class Solution {
    public String reverseWords(String s) {
        int n = s.length();
        StringBuilder str = new StringBuilder();
        int i = n - 1;

        while (i >= 0) {

            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }

            int j = i;

            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }

            if (j >= 0) {
                str.append(s.substring(i + 1, j + 1));
                str.append(' ');
            }
        }

        return str.toString().trim();
    }
}