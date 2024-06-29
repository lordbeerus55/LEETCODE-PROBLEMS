class Solution {
    public void moveZeroes(int[] nums) {
        int notzeroelement = 0 ; 
        for(int i = 1 ; i <nums.length;i++){
            if(nums[i]!=0){
                int temp = nums[notzeroelement];
                nums[notzeroelement]=nums[i];
                nums[i]=temp;
                notzeroelement++;
            }
        }
    }
}