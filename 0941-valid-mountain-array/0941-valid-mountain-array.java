class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<=2){
            return false;
        }
        int maximum = Integer.MIN_VALUE;
        int maxchaindex=0;
        for(int i = 0 ; i<arr.length;i++){
            if(arr[i]>maximum){
                maximum=arr[i];     
                maxchaindex=i;   
                    }
        }
        if(maximum==arr[arr.length-1] || maximum == arr[0]){
            return false;
        }
        for(int i =1 ;i<maxchaindex;i++){
            if(arr[i]<=arr[i-1]){
                return false;
            }
        }
        for(int i = maxchaindex+1;i<=arr.length-2;i++){
            if(arr[i]<=arr[i+1]){
                return false;
            }
        }
        for(int i = 0 ;i<arr.length-1;i++){
            if(arr[i]==arr[i+1])
           {
            return false;
           }
        }
        return true;

    }
}