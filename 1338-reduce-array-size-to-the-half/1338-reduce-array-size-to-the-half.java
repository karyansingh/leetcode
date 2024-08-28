class Solution {
    public int minSetSize(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int arrSize = arr.length / 2;

        for (int n : arr) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        int count = 0;
        int req = arr.length;
        for (int key : map.keySet()) {
            req -= map.get(key); 
            count++;
            if (req <= arrSize) {
                break;
            }
        }

        return count;
    }
}
