class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String wordd1 = "";
        String wordd2 = "";
        for (int i = 0; i < word1.length; i++) {
            wordd1 += word1[i];
        }

        for (int i = 0; i < word2.length; i++) {
            wordd2 += word2[i];
        }

        if (wordd1.equals(wordd2)) {
            return true;
        }
        return false;
    }
}