class Solution {
    public int maxArea(int[] height) {
        int start=0;
        int end =height.length-1;
        int maxwaterarea=0;

        while(start<end){
            if(height[start]<=height[end]){
                int area=(end-start)*height[start];
                maxwaterarea=Math.max(maxwaterarea,area);
                start++;
            }
            else if(height[start]>height[end]){
                int area=(end-start)*height[end];
                maxwaterarea=Math.max(maxwaterarea,area);
                end--;
            }
            

        }
        return maxwaterarea;
    }
}