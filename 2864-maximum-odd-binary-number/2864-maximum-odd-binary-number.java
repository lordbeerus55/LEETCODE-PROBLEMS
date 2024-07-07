class Solution {
    public String maximumOddBinaryNumber(String s) {
        int countone=0;
        int countzero=0;

        for(int i = 0 ; i< s.length() ;i++) {
            if(s.charAt(i)=='0'){
                countzero++;
            }
            else{
                countone++;
            }
        }
        System.out.println(countzero+" "+countone);
        
        StringBuilder answer = new StringBuilder();
       
        while(countone-- > 1){
            answer.append("1");
           
        }
        while(countzero-- > 0){
            answer.append("0");
           
        }
        answer.append("1");
        return answer.toString();
    }
}