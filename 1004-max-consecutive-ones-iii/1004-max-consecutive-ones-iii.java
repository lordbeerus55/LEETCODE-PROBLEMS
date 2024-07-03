class Solution {
    public int longestOnes(int[] nums, int k) {
        int left =0;
        int right =0 ;
        int kcount=k;
        int max =0 ;
        for(int i = 0; i< nums.length;i++){
            if(nums[i]==1){
                right++;
            }
            else{
                if(kcount>0){
                    right++;
                    kcount--;
                }
                else{
                    max=Math.max(max,right-left);
                    while(left<nums.length&&nums[left]==1){
                        left++;
                    }
                    left++;
                    right++;
                }
            }
        }
        max=Math.max(max,right-left);
        return max;
    }
}