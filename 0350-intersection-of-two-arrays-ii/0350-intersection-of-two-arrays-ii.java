class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        int p1 = 0;
        int p2 = 0;
        int n1 = nums1.length;
        int n2 = nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        while(p1<n1&&p2<n2){
            if(nums1[p1]<nums2[p2]){
                p1++;
            }
            if(nums2[p2]<nums1[p1]){
                p2++;
            }
            if(nums1[p1]==nums2[p2]){
                list.add(nums1[p1]);
                p1++;
                p2++;
            }
        }
int[] answer = new int[list.size()];
for(int i = 0;i<answer.length;i++){
    answer[i]=list.get(i);
}
return answer;
        
    }
}