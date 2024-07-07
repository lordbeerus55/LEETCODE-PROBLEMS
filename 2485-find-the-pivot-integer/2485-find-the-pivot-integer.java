class Solution {
    public int pivotInteger(int n) {
        int right_sum = 0;
        for (int i = n; i > 0; i--) {

            right_sum += i;

            int left_sum = i * (i + 1) / 2;
            if(left_sum==right_sum){
                return i;
            }
        }

        return -1;
    }
}