class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
         int count = 0 ; 
         int maxcount = 0; 
         int start = 0 ; 
         for(int end = 0; end < nums.length ; end++){
            if(nums[end]==1){
                count++;
                maxcount=Math.max(count,maxcount);
            }
            else{
                count=0;
            }
         }
         return maxcount;
        }

    }