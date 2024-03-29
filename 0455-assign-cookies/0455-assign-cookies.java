class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int greedsum=0;
        for(int i = 0 ;i<s.length;i++){
            greedsum+=s[i];
        }
        int counter=0;
        for(int j = 0 ; j<g.length;j++){
            if(greedsum>=g[j]){
                counter++;
            }
            greedsum=greedsum-g[j];
        }
        return counter;
    }
}