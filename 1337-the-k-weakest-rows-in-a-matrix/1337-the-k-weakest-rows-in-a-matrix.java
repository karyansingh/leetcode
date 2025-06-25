class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int rows = mat.length;
        List<int[]> strengthList = new ArrayList<>();

        for (int i = 0; i < rows; i++) {
            int count = 0;
            for (int num : mat[i]) {
                if (num == 1) count++;
                else break; 
            }
            strengthList.add(new int[]{i, count});
        }

       
        Collections.sort(strengthList, (a, b) -> {
            if (a[1] != b[1]) return a[1] - b[1];
            return a[0] - b[0];
        });

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = strengthList.get(i)[0];
        }

        return result;
    }
}