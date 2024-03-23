class Solution {
    static int[] intersection(int[] nums1, int[] nums2) {
        Set <Integer> s = new HashSet<>();
        for(int i = 0 ; i<nums2.length;i++){
            s.add(nums2[i]);
        }
        List<Integer> result = new ArrayList<>();
        for(int i = 0 ; i<nums1.length;i++){
            if(s.contains(nums1[i])){
                result.add(nums1[i]);
            }
        }
        Set<Integer> set = new HashSet<>(result);
        List<Integer> answer = new ArrayList<>(set);
        
        
        int[] resultarray = new int[answer.size()];
        for(int i = 0 ;i<resultarray.length;i++){
            resultarray[i]=answer.get(i);
        }
        
        
    return resultarray;
        
    }
}