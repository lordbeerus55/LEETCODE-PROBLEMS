class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] answer = new int[nums.length*2];
        for(int i = 0 ; i<nums.length;i++){
            answer[i]=nums[i];
        }
        for(int i = nums.length;i<answer.length;i++){
            answer[i]=nums[i-nums.length];
        }
        return answer;
    }
}