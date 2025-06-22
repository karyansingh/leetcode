class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> result = new ArrayList<>();
        int start = 0;

        for (int end = 0; end <= s.length(); end++) {
            if (end == s.length() || s.charAt(end) != s.charAt(start)) {
                if (end - start >= 3) {
                    result.add(Arrays.asList(start, end - 1));
                }
                start = end;
            }
        }

        return result;
    }
}