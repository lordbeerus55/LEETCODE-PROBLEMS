class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(k==0) return false;
         int start = 0 ;
        Set<Integer> set = new HashSet<>();
        for(int end = 0 ; end< nums.length;end++){
            if(set.contains(nums[end])){
                return true;
            }
            if(end>=k){
                set.remove(nums[start]);
                start++;
            }
            set.add(nums[end]);
        }
        return false;
    }
}