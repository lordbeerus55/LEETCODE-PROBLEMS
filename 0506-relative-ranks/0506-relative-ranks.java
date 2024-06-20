class Solution {
    public int findMax(int[] score) {
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i<score.length;i++){
            max= Math.max(max, score[i]);
        }
        return max;
    }
    public String[] findRelativeRanks(int[] score) {
        
       int maximum = findMax(score);
        int[] ranks = new int[maximum + 1];
        for (int i = 0; i < score.length; i++) {
            ranks[score[i]] = i + 1;
        }

        String[] result = new String[score.length];
        int rank = 1;
        for (int i = maximum; i >= 0; i--) {
            if (ranks[i] != 0) {
                int originalIndex = ranks[i] - 1;
                if (rank == 1) {
                    result[originalIndex] = "Gold Medal";
                } else if (rank == 2) {
                    result[originalIndex] = "Silver Medal";
                } else if (rank == 3) {
                    result[originalIndex] = "Bronze Medal";
                } else {
                    result[originalIndex] = Integer.toString(rank);
                }
                rank++;

            }
            if (rank > score.length) {
                break;
            }
            ;
        }
        return result;
           
    }
}