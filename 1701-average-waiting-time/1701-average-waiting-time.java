class Solution {
    public double averageWaitingTime(int[][] customers) {
        int prev = 0; // Track when the previous customer finishes
        double totalWaitingTime = 0; // Accumulate total waiting time
        
        for (int i = 0; i < customers.length; i++) {
            int arrival = customers[i][0];
            int serviceTime = customers[i][1];
            
            if (arrival > prev) {
                // Customer arrives after previous one finishes
                prev = arrival + serviceTime;
                totalWaitingTime += serviceTime;
            } else {
                // Customer arrives before or when previous one finishes
                totalWaitingTime += (prev - arrival) + serviceTime;
                prev += serviceTime;
            }
        }
        
        return (double) totalWaitingTime / customers.length;
    }
}
