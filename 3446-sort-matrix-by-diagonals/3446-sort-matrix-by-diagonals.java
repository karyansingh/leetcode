class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n = grid.length;
        
        for(int d=1;d<n;d++)
        {
            int i=0,j=d;
            PriorityQueue<Integer> pq =  new PriorityQueue<>((a,b)->(a-b));
            int i1 = i, j1 = j;
            while(i<n && j<n)
            {
                pq.offer(grid[i][j]);
                i++;
                j++;
            }
            while(i1<n && j1<n)
            {
                grid[i1][j1] = pq.poll();
                i1++;
                j1++;
            }
        }

        for(int d=0;d<n;d++)
        {
            int i=d,j=0;
            PriorityQueue<Integer> pq =  new PriorityQueue<>((a,b)->(b-a));
            int i1 = i, j1 = j;
            while(i<n && j<n)
            {
                pq.offer(grid[i][j]);
                i++;
                j++;
            }
            while(i1<n && j1<n)
            {
                grid[i1][j1] = pq.poll();
                i1++;
                j1++;
            }
        }
        return grid;
    }
}