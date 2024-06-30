class Solution {
    public String reversePrefix(String word, char ch) {
            char[] chararray=word.toCharArray();
        int r = word.indexOf(ch);
        int l=0;
        while(l<=r){
            char temp = chararray[l];
            chararray[l]=chararray[r];
            chararray[r]=temp;
            l++;
            r--;
        }
        return new String(chararray);
    }
}