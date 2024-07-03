class Solution {
    public int longestPalindrome(String s) {
         Map<Character,Integer> map = new HashMap<>();

         int count = 0; 
         int odd = 0 ;
         for(int i = 0 ; i <s.length();i++){
            char c = s.charAt(i);

            map.put(c,map.getOrDefault(c,0)+1);
         }

         for(Map.Entry<Character,Integer> entry: map.entrySet()){
            int frequency = entry.getValue();
            if(frequency>1){
                count+=(frequency/2) *2;
            }
            if(frequency%2==1){
                odd =1;
            }
         }
         return count+odd;

    }
        
}