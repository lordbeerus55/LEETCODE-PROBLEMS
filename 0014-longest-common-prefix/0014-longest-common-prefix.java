class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s = strs[0];
        String answer = "";
        int max = Integer.MAX_VALUE;
        String checker = "";
        if(strs[0].length()==0){
            return strs[0];
        }
         if(strs.length==1){
            return strs[0];
        }
        for(int i = 1;i<strs.length;i++){
            int count = 0 ;
            int length= 0;
            int whilecounter=0;
            
            if(s.length()<strs[i].length()){
                length=s.length();
            }
            else{
                length = strs[i].length();
                }
            while(whilecounter<length){
                if(s.charAt(whilecounter)==strs[i].charAt(whilecounter)){
                    count++;
                }
                else{
                    break;
                }
                whilecounter++;
            }
            if(count<=max){
                max=count;
            }
            
        }
        for(int i = 0 ; i <=max-1 ; i++){
            answer+=s.charAt(i);
        }
        return answer;

    }
}