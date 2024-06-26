class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLength =0;
        int start = 0;
        int sum = 0;
        for (int end = 0; end < nums.length; end++) {

            sum += nums[end];

            while (sum >= target) {
                if (minLength == 0) {
                    minLength = end - start + 1;
                }
                minLength = Math.min(minLength, end - start + 1);

                sum -= nums[start];
                start++;
            }

        }

        return minLength;

    }
}