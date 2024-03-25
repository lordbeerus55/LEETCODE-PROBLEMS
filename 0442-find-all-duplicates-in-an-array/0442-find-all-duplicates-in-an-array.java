class Solution {
    public  List<Integer> findDuplicates(int[] nums) {
          int n = nums.length;
        Arrays.sort(nums);
        List<Integer> answer = new ArrayList<>();
        for(int i = 0 ; i<n-1;i++){
            int count = 0 ;
            
                if(nums[i]==nums[i+1]){
                    count++;
                
            }
            if(count==1){
               answer.add(nums[i]);
            }
        }
        return answer;
    }
}