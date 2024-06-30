class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int p1 = 0;
        int p2 = 0;
        ArrayList<int[]> answer = new ArrayList<>();
        
        while(p1<nums1.length && p2< nums2.length){
            if(nums1[p1][0]<nums2[p2][0]){
                answer.add(nums1[p1]);
                p1++;
            }
            else if(nums1[p1][0]>nums2[p2][0]){
            answer.add(nums2[p2]);
            p2++;
            }
             else if(nums1[p1][0]==nums2[p2][0]){
                answer.add(new int[] {nums1[p1][0], nums1[p1][1] + nums2[p2][1]});
                p1++;
                p2++;
            }
        }
        while(p1<nums1.length){
            answer.add(nums1[p1]);
            p1++;
        }
          while(p2<nums2.length){
            answer.add(nums2[p2]);
            p2++;
        }

        return answer.toArray(new int[answer.size()][]);
           
    }
}