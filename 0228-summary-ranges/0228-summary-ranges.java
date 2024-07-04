class Solution {
    public List<String> summaryRanges(int[] nums) {
      List<String> result = new ArrayList<>();
        int start =0 ; 
        int end = 0 ;
        int i =0 ;
        int n = nums.length;
        while(i<n){
            if(i+1<n&&nums[i+1]-nums[i]==1){
                end++;
            }
            else{
                if(start==end){
                    result.add(String.valueOf(nums[start]));
                }
                else{
                    result.add(nums[start]+"->"+nums[end]);
                }
                end++;
                start=end;
            }
            i++;
        }
        return result;
    }
}