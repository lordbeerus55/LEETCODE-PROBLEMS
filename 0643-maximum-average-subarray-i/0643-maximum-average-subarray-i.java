class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int start =0 ; 
        int windowSum=0 ;
        double max = Integer.MIN_VALUE;

        for(int end = 0 ; end<nums.length;end++){
            windowSum+=nums[end];

            if(end-start+1==k){
                max=Math.max(max,(double)windowSum/k);
                windowSum-=nums[start];
                start++;
            }
        }
        return max;
    }
}