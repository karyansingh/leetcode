/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] matrix = new int[m][n];
        
        for (int i = 0; i < m; i++) {
            Arrays.fill(matrix[i], -1);
        }

        int topRow = 0, bottomRow = m - 1, leftCol = 0, rightCol = n - 1;

        while (head != null) {
            // Traverse from left to right
            for (int i = leftCol; i <= rightCol && head != null; i++) {
                matrix[topRow][i] = head.val;
                head = head.next;
            }
            topRow++;

            // Traverse from top to bottom
            for (int j = topRow; j <= bottomRow && head != null; j++) {
                matrix[j][rightCol] = head.val;
                head = head.next;
            }
            rightCol--;

            // Traverse from right to left
            for (int k = rightCol; k >= leftCol && head != null; k--) {
                matrix[bottomRow][k] = head.val;
                head = head.next;
            }
            bottomRow--;

            // Traverse from bottom to top
            for (int l = bottomRow; l >= topRow && head != null; l--) {
                matrix[l][leftCol] = head.val;
                head = head.next;
            }
            leftCol++;
        }

        return matrix;
    }
}
