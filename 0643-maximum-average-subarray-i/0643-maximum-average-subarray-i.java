class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int start=0;
        double max=Integer.MIN_VALUE;
        double windowsum=0;
        for(int end = 0 ; end<nums.length;end++){
            windowsum+=nums[end];

            if(end-start+1==k){
                max=Math.max(max,windowsum/k);
                windowsum-=nums[start];
                start++;
            }
        }
        return max;
        
    }
}