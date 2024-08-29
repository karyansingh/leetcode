class Solution {
    public int matchPlayersAndTrainers(final int[] players, final int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);

        int j = 0, count = 0;

        for(int i = 0; i < players.length && j < trainers.length; ++i) 
        {
            while(j < trainers.length && trainers[j] < players[i])
                j++;
            
            if(j < trainers.length) {
                count++;
                ++j;
            }
        }

        return count;
    }
}