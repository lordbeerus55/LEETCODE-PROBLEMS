class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int maxlength=0;
        int l=0;
        for(int r= 0 ; r<s.length();r++){
            char current = s.charAt(r);
          
            if(!set.contains(current)){
                  set.add(current);
                  maxlength=Math.max(maxlength,r-l+1);

             } else{
                while(set.contains(current)){
                    set.remove(s.charAt(l));
                    l++;
                }

                set.add(current);
             }

            
        }
        return maxlength;
    }
}