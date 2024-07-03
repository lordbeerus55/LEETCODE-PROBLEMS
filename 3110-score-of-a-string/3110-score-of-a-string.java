class Solution {
    public int scoreOfString(String s) {
        int count = 0 ; 
        for(int i =0 ; i<s.length()-1;i++){
            // System.out.println((int)s.charAt(i)+" - "+(int)s.charAt(i+1));
            int difference = Math.abs(s.charAt(i)-s.charAt(i+1));
            count+=difference;
    }
    return count;
}
}