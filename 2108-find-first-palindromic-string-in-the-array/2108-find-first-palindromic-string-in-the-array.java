class Solution {
    public String firstPalindrome(String[] words) {
        int n = words.length;
        for (int i =0 ; i<n ; i++){
            String newstring="";
            
            for(int j = words[i].length()-1 ;j>=0;j--){
                newstring=newstring+words[i].charAt(j);
                
            }
            if(newstring.equals(words[i])){
                return newstring;
            }
            
        }
return "";
    }
}