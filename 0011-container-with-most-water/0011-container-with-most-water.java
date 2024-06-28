class Solution {
    public int maxArea(int[] arr) {
        int maxwaterarea=0 ; 
        int start = 0 ; 
        int lastpoint = arr.length-1;
        while(start<=lastpoint){
           if(arr[start]<arr[lastpoint]){
            maxwaterarea=Math.max(maxwaterarea,(lastpoint-start)*arr[start]);
            start++;
           }
           else if(arr[lastpoint]<=arr[start]){
            maxwaterarea=Math.max(maxwaterarea,(lastpoint-start)*arr[lastpoint]);
            lastpoint--;
           }
        }
        return maxwaterarea;
    }
}