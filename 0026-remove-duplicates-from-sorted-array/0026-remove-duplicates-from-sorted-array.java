class Solution {
    public int removeDuplicates(int[] arr) {
       int l =0 ;
       int r = 1;
        
       while(r<arr.length){
        if(arr[l]!=arr[r]){
             l++;
            arr[l]=arr[r];
           
          
        
        }
        r++;
        }
          return l+1;
       
     
}
}