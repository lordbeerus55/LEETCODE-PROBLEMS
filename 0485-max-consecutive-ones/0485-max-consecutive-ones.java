class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxcount = 0; 
        int count = 0 ;
        for(int i =0 ; i < nums.length;i++){
            if(nums[i]==1){
                count++;
                if(count>maxcount){
                    maxcount=count;
                }
            }
            else{
                count=0;
            }
        }
        if(maxcount>count){
            return maxcount;
        }
        else{
            return count;
        }

    }}