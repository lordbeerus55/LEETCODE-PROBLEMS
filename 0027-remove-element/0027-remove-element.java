class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0 ; 
        for(int i= 0 ;i<nums.length;i++){
            if(nums[i]!=val){
                count++;
            }
        }
        int notzeroelement=0;
        for(int i=0; i<nums.length;i++){
             if(nums[i]!=val){
                        int temp = nums[i];
                        nums[i]=nums[notzeroelement];
                        nums[notzeroelement]=temp;
                        notzeroelement++;
                        
                    }
            
            }
            return count;
            
        }
    }
