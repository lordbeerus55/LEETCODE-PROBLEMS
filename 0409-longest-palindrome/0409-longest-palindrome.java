class Solution {
    public int longestPalindrome(String s) {
         Map<Character,Integer> map = new HashMap<>();

         int count = 0; 
         boolean odd = false;
         for(int i = 0 ; i <s.length();i++){
            char c = s.charAt(i);

            map.put(c,map.getOrDefault(c,0)+1);
         }

         for(Map.Entry<Character,Integer> entry: map.entrySet()){
            int frequency = entry.getValue();
            if(frequency%2==0){
                count+=frequency;
            }
            else{
                count+=frequency-1;
                odd=true;
            }
         }
         
         if(odd==true){
            return count+1;
         }
         else{
            return count;
         }

    }
        
}