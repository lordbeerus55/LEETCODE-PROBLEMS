class Solution {
    public String reversePrefix(String word, char ch) {
            String str = "";
        int index =0  ; 
        for(int i = 0 ;i < word.length();i++){
            if(word.charAt(i)==ch){
                index=i;
                break;
            }
        }
        for(int i =index;i>=0;i--){
            str+=word.charAt(i);
        }
        for(int i = index+1;i<word.length();i++){
            str+=word.charAt(i);
        }
        return str;
    }
}