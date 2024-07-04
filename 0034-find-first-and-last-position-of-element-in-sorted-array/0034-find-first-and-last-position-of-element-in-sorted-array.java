class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] answer = {-1,-1};
        int start=binarysearch(nums,true,target);
        int end =binarysearch(nums,false,target);
        answer[0]=start;
        answer[1]=end;
       return answer;   
       
    }
    public int binarysearch(int[] nums, boolean findstartornot,int target){
        int start =0;
        int end = nums.length-1;
        int ans=-1;
        while(start<=end){
            int mid = start+(end-start)/2;

            if(nums[mid]>target){
                end=mid-1;
                
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                ans=mid;
                if(findstartornot==true){
                                       end=mid-1;

                }
                else{
                     start=mid+1;
                }
            }
        }
        return ans;
    }
}