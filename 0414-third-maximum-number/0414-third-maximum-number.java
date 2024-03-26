class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        
        LinkedHashSet<Integer> answer = new LinkedHashSet<>();
        for(int i = 0;i<nums.length;i++){
            answer.add(nums[i]);
        }
        int arr[] = new int[answer.size()]; 
        int i=0; 
        
        // iterating over the hashset 
        for(int ele:answer){ 
          arr[i++] = ele; 
        }
     
        if(arr.length<=2){
            int fafafa=arr[arr.length-1];
            return fafafa;

        }
        
            return arr[arr.length-3];
        
        
    }
}