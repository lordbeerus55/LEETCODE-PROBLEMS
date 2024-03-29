class Solution {
    public int[] productExceptSelf(int[] nums) {
           int length = nums.length;
        int[] straightmult = new int[length];
        int[] reversemult = new int[length];
        int[] answer = new int[length];
        int straightmultcount = 1;
        int reversemultcount = 1;
        for (int i = 0; i < length; i++) {
            straightmult[i] = straightmultcount;
            straightmultcount *= nums[i];

        }
        for (int i = length - 1; i >= 0; i--) {
            reversemult[i] = reversemultcount;
            reversemultcount *= nums[i];

        }
        
        for(int i= 0 ;  i  < length;i++){
            answer[i]=straightmult[i]*reversemult[i];
        }
        return answer;
    }
}