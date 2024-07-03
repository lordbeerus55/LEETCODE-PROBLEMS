class Solution {
    public int countGoodSubstrings(String s) {
        int left = 0;
        int count = 0;
        String temp = "";
        for (int end = 0; end < s.length() - 2; end++) {
            if (end - left + 1 == 3) {
            }
            if (s.charAt(end) != s.charAt(end + 1) && s.charAt(end + 1) !=
             s.charAt(end + 2)
                    && s.charAt(end + 2) != s.charAt(end)) {
                count++;
            }
            left++;
        }
        return count;
    }

}
