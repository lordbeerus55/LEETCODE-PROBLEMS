class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int start = 0;
        int lengthofsubstring = 0;
        for (int end = 0; end < s.length(); end++) {
            char ch = s.charAt(end);
            if (!set.contains(ch)) {
                set.add(ch);
                lengthofsubstring = Math.max(lengthofsubstring, end - start + 1);
            } else {
                while (set.contains(ch)) {

                    set.remove(s.charAt(start));
                    start++;

                }

                set.add(ch);
            }

        }
        return lengthofsubstring;
    }
}