class Solution {
    public int maxDifference(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int evenFreq = 0, oddFreq = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 == 0) {
                evenFreq = Math.max(evenFreq, entry.getValue());
            } else {
                oddFreq = Math.max(oddFreq, entry.getValue());
            }
        }
        return oddFreq - evenFreq;
    }
}