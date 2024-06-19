class Solution {
    public boolean search(int[] nums, int target) {
        int l = 0;
        int h = nums.length-1;

        while(l<=h){
            int mid = (l + h)/2;

            if(target == nums[mid]){
                return true;
            }

            else if(nums[mid]==nums[l] & nums [mid] == nums[h]){
                l++;
                h--;
               
            }
           else  if(nums[mid]>=nums[l]){  // left side sorted till mid
                if(nums[l]<=target && target <nums[mid]){
                    h = mid-1;
                }else{
                    l = mid +1;
                }
            }else{
                if(nums[mid]<target && nums[h]>=target){
                    l = mid+1;
                }else{
                    h = mid -1;
                }
            }

        }

        return false;

    }
}