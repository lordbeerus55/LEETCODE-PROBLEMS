class Solution {
    public String reverseWords(String s) {
       String[] sArray=s.split(" ");

       for(int i = 0; i < sArray.length;i++){
        String split=sArray[i];
        String reverse="";
        for(int j = split.length()-1; j>=0;j--){
            reverse+=split.charAt(j);

        }
        sArray[i]=reverse;

       }
       String result = "";
       for(int i =0 ; i<sArray.length;i++){
        result+=sArray[i]+ " ";
       }
       return result.strip();
    }
}