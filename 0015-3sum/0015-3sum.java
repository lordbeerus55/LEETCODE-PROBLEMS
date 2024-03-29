class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            // skip i duplicates for long af testcases that leetcode has
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];

                if (sum == 0) {
                    //found an answer then add
                    answer.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    // skip j duplicates
                    while (j < k && nums[j] == nums[j + 1]) {
                        j++;
                    }
                    // skip k duplicates
                    while (j < k && nums[k] == nums[k - 1]) {
                        k--;

                    }
                    j++;
                    k--;
                }
                // if sum is more than 0 then only increase j
                else if (sum < 0) {
                    j++;

                }
                //if sum more than 0 then only decrease k ; 
                 else {
                    k--;
                }
            }
        }
        return answer;
    }
}