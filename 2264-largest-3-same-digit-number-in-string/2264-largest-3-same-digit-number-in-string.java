class Solution {
     public String largestGoodInteger(String str) {
        int result = -1;
        int i = 0;
        while (i < str.length() - 2) {
            char firstnumber = str.charAt(i);
            char secondnumber = str.charAt(i + 1);
            char thirdnumber = str.charAt(i + 2);
            if (firstnumber == secondnumber && secondnumber == thirdnumber) {
                result = Math.max(result, firstnumber - '0');
                i += 3;
            } else if (firstnumber == secondnumber && secondnumber != thirdnumber
                    || firstnumber != secondnumber && secondnumber != thirdnumber) {
                i += 2;

            } else {
                i++;
            }
        }
        return result == -1 ? "" : String.valueOf(result).repeat(3);

    }
}