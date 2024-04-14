class Solution {
    public boolean isPerfectSquare(int num) {
        if(num ==0 || num == 1 ){
            return true;
        }
        long start = 0 ;
        long end = num/2 +1 ; 
        while(start<=end){
             long middle = start+(end-start)/2;
            if(middle*middle==num){
                return true;
            }
            else if(middle*middle>num){
                end=middle-1;
            }
            else{
                start=middle+1;
            }
        }
        return false;
    }
}