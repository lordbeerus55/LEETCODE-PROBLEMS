class Solution {
    public boolean isPalindrome(String s) {
        String straight = "";
        s= s.toLowerCase();
        for(int i =0 ;i<s.length();i++){
            if(s.charAt(i)>='a'&& s.charAt(i)<='z'){
                straight+=s.charAt(i);
            }
        }
        int start = 0;
        int end = straight.length()-1;
        while(start<=end){
            if(straight.charAt(start)!=straight.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}