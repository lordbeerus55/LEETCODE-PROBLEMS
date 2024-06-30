class Solution {
    public double minimumAverage(int[] nums) {
         Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int l = 0;
        int r = nums.length - 1;
        int n = nums.length;
        double minaverage = 300;
        while (l < n / 2) {
            double average = (nums[l] + nums[r]) / 2.0;
           
            minaverage = Math.min(minaverage, average);
            l++;
            r--;
        }
        return minaverage;
    }
}