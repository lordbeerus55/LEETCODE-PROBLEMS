class Solution {
    public int[] twoSum(int[] numbers, int target) {
       int leftpointer=0;
       int rightpointer=numbers.length-1;
       int[] answer = new int[2];
       
       while(leftpointer<rightpointer){
        int sum=numbers[leftpointer]+numbers[rightpointer];
        if(sum>target){
            rightpointer--;
        }
        else if(sum<target){
            leftpointer++;
        }
        else{
            return new int[] {leftpointer+1,rightpointer+1};
        }
       }
       return answer;
      
        
    }
}