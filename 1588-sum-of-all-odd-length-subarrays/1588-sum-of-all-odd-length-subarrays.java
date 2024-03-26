class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int totalcount = 0 ;
        for(int i =0  ; i <arr.length;i++){
            int normalcount = 0 ;
            for(int j= i ; j<arr.length;j+=2){
                int start= i;
                while(start<=j){
                    totalcount += arr[start];
                    start++;
                }

            }

        }
        return totalcount;
    }
}