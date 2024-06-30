class Solution {
    public String makeSmallestPalindrome(String s) {
        char charArr[] = s.toCharArray();
        int i = 0, j = s.length() - 1;
        while (i < j) {
            charArr[i] = (char) Math.min(charArr[i], charArr[j]);
            charArr[j] = charArr[i];
            i++;
            j--;
        }
        return new String(charArr);
    }
}