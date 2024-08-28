class Solution {
    public int[] numberOfPairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        int res[] = new int[2];
        for (int key : map.keySet()) {
            int count = map.get(key);
            res[0] += count / 2; 
            res[1] += count % 2; 
        }
        return res;
    }
}
