class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minlength=0;
        int start =0; 
        int sum=0;
        for(int end = 0 ; end<nums.length;end++){
            sum+=nums[end];
            while(sum>=target){
                if(minlength==0){
                minlength=end-start+1;}
                minlength=Math.min(minlength,end-start+1);

                sum-=nums[start++];
                
            }
        }
        return minlength;
    }
}