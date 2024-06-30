class Solution {
    public String makeSmallestPalindrome(String s) {
       char[] stringtochar=s.toCharArray();
        int i = 0 ;
        int j = stringtochar.length-1;
        while(i<j){
            stringtochar[i] = (char) Math.min(stringtochar[i], stringtochar[j]);
            stringtochar[j] = stringtochar[i];
            i++;
            j--;
        }
        return new String(stringtochar);
    }
}