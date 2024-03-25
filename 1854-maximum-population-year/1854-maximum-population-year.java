class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] years = new int[2051]; // Assuming logs range from 1950 to 2050
        
        // Iterate through logs and mark population for each year
        for (int[] log : logs) {
            for (int i = log[0]; i < log[1]; i++) {
                years[i - 1950]++; // Adjusting index for 1950 as the starting year
            }
        }
        
        // Find the year with maximum population
        int maxPopulationYear = 0;
        int maxPopulation = years[0];
        for (int i = 1; i < years.length; i++) {
            if (years[i] > maxPopulation) {
                maxPopulation = years[i];
                maxPopulationYear = i + 1950; // Adjusting year for 1950 as the starting year
            }
        }
        
        return maxPopulationYear;
    }
}
