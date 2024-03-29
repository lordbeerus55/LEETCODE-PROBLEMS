class Solution {
    public int maxArea(int[] arr) {
        int maxwaterarea=0 ; 
        int start = 0 ; 
        int lastpoint = arr.length-1;
        while(start<=lastpoint){
            int min = Math.min(arr[start],arr[lastpoint]);
            int multiplier=lastpoint-start;
            int currentarea=min*multiplier;
           maxwaterarea=Math.max(maxwaterarea,currentarea);
           if(arr[start]<arr[lastpoint]){
            start++;
           }
           else if(arr[start]>=arr[lastpoint]){
            lastpoint--;
           }
        }
        return maxwaterarea;
    }
}