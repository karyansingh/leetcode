class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> map = new HashMap<>();
        int left = 0, right = 0;
        int maxCount = 0;

        for (right = 0; right < fruits.length; right++) {
            int curr = map.getOrDefault(fruits[right], 0);
            map.put(fruits[right], curr + 1);

            // Shrink the window if we have more than 2 types of fruits
            while (map.size() > 2) {
                int fruitCount = map.get(fruits[left]);
                if (fruitCount == 1) {
                    map.remove(fruits[left]); // ✅ Fixed typo here
                } else {
                    map.put(fruits[left], fruitCount - 1);
                }
                left++;
            }

            maxCount = Math.max(maxCount, right - left + 1);
        }

        return maxCount;
    }
}