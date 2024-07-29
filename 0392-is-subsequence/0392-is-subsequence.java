class Solution {
    public boolean isSubsequence(String s, String t) {
        int p1 =0;
        int p2=0;
        String ans ="";
        while(p1<s.length() && p2<t.length()){
            if(s.charAt(p1)==t.charAt(p2)){
                 ans+=t.charAt(p2);
                p1++;
                p2++;
               
            }
            else{
                p2++;
            }
        }
        if(ans.equals(s)){ System.out.println(ans);
            return true;
        }
        else{
            System.out.println(ans);
            return false;
        }
    }
}