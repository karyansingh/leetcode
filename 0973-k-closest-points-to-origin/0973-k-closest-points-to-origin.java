import java.util.PriorityQueue;

class Solution {
    public class Point implements Comparable<Point> {
        int x;
        int y;
        int dist;
        
        public Point(int x, int y, int dist) {
            this.x = x;
            this.y = y;
            this.dist = dist;
        }
        
        @Override
        public int compareTo(Point p2) {
            return this.dist - p2.dist;
        }
    }
    
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Point> pq = new PriorityQueue<>();
        for (int i = 0; i < points.length; i++) {
            int dist = points[i][0] * points[i][0] + points[i][1] * points[i][1];
            pq.add(new Point(points[i][0], points[i][1], dist));
        }
        
        int[][] result = new int[k][2];
        for (int i = 0; i < k; i++) {
            Point closest = pq.poll();
            result[i][0] = closest.x;
            result[i][1] = closest.y;
        }
        
        return result;
    }
}
