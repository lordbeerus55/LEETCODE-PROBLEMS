class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i< nums.length ;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        System.out.println(map);
        int maxfrequency=0;

        for(int i:map.values()){
            maxfrequency=Math.max(i,maxfrequency);
        }

        int answer =0 ;
        for(int i:map.values()){
            if(i==maxfrequency){
                answer=answer+i;
            }
        }
        return answer;
    }
}