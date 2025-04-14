class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int ans = 0;
        int currentCapacity = capacity; 

        for (int i = 0; i < plants.length; i++) {
            if (currentCapacity >= plants[i]) {
                
                ans++;
                currentCapacity -= plants[i];
            } else {
                
                ans += 2 * i; 
                ans++;
                currentCapacity = capacity - plants[i];
            }
        }

        return ans;
    }
}