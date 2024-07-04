class Solution {
    public boolean isPalindrome(int x) {
         if(x<0){
            return false;
        
        }
        else{
            int temp = x ;
            int reverse=0;
            while(temp>0){
                int remainder=temp%10;
                reverse=reverse*10+remainder;
                temp=temp/10;
            }
            if(reverse==x){
                return true;
            }

        }
        return false;
    }
}