class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int l=0;
        int r=1;
        while(r<nums.length){
            if(nums[l]!=nums[r]){
                l++;
                r++;
            }
            else if(nums[l]==nums[r]){
                return nums[r];
            }
        }
        return 0;
    }
}