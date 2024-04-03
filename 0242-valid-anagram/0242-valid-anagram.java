class Solution {
    public boolean isAnagram(String s, String t) {
        char[] d = new char[9999999];
        char[] f = new char[9999999];
        for(int i = 0 ; i<s.length();i++){
            d[i]=s.charAt(i);

        }
        for(int i = 0 ; i<t.length();i++){
            f[i]=t.charAt(i);
        }
        Arrays.sort(d);
        Arrays.sort(f);
        if(Arrays.equals(d, f)){
            return true;
        }
        return false;

    }
}