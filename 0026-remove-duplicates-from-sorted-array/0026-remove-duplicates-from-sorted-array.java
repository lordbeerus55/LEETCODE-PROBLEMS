class Solution {
    public int removeDuplicates(int[] nums) {
      int k = 0;
        for(int i = 0 ; i < nums.length-1;i++ ) {
            if(nums[i]==nums[i+1]){
                nums[i]=Integer.MIN_VALUE;
            }
            
        }
       
        for(int i = 0 ; i<nums.length;i++){
                if(nums[i]!=Integer.MIN_VALUE){
                k++;
            }
            }
        int minusoneelement = 0;
        for (int i = 0 ;i<nums.length;i++){
            if(nums[i]!=Integer.MIN_VALUE){
                int temp= nums[i];
                nums[i]=nums[minusoneelement];
                nums[minusoneelement]=temp;
                minusoneelement++;
            }
        }    
        
        
        
        
        return k;
    }
}