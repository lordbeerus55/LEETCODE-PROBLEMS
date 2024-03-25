class Solution {
    public int dayOfYear(String date) {
         int Year = Integer.parseInt(date.substring(0,4));
        int Month = Integer.parseInt(date.substring(5,7));
        int Day  = Integer.parseInt(date.substring(8));
        int[] daysaftereachmonthcompleted = {0,31,59,90,120,151,181,212,243,273,304,334};
        if(Year%4==0 && Year!=1900 && Month > 2 ){
            Day+=1;
        }
        return daysaftereachmonthcompleted[Month-1]+Day;
        
    }
}