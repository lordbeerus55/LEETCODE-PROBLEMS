class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int [] answer = new int[nums1.length];
        for(int i = 0 ; i <nums1.length ; i++){
            for (int j = 0 ; j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    int looper=j;
                    int fafa=0;
                    while(looper<nums2.length){
                        if(nums2[looper]>nums2[j]){
                          
                            answer[i]=nums2[looper];
                             break;
                        }
                        else{
                            answer[i]=-1;
                        }
                          looper++;
                    }
                    
                }

            }
        }
        return answer;
    }
}