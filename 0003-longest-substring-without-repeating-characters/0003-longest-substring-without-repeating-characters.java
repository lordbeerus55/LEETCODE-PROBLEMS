class Solution {
    public int lengthOfLongestSubstring(String s) {
       Set<Character> set = new HashSet<>();
        int start =0 ;
        int maxlength=0;
        for(int end = 0 ;end<s.length();end++){
            char current = s.charAt(end);
            if(!set.contains(current)){
                set.add(current);
                maxlength=Math.max(maxlength,end-start+1);

            }
            else{
                while(set.contains(current)){
                    set.remove(s.charAt(start));
                    start++;

                }
                set.add(current);
            }
        }
        return maxlength;
    }
}