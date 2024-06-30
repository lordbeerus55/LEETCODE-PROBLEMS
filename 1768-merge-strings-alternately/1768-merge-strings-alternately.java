class Solution {
    public String mergeAlternately(String word1, String word2) {
        int p1=0;
        int p2=0;
        String result="";
        while(p1<word1.length()&&p2<word2.length()){
            if(p1==p2){
                result+=word1.charAt(p1);
                p1++;
            }
            if(p2<p1){
                result+=word2.charAt(p2);
                p2++;
            }
            else if(p1<p2){
                result+=word1.charAt(p1);
                p1++;
            }
        }
        if(word1.length()<word2.length()){
            while(p2<word2.length()){
                result+=word2.charAt(p2);
                p2++;
            }
        }
        else{
            while(p1<word1.length()){
                result+=word1.charAt(p1);
                p1++;
            }

        }

        return result;
    }
}