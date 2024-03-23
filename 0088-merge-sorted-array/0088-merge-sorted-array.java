class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int elementofnums2=0;
           for(int i = m;i<nums1.length;i++){
             nums1[i]=nums2[elementofnums2];
             elementofnums2++;
           }
           Arrays.sort(nums1);
           System.out.println(Arrays.toString(nums1));
    }
}