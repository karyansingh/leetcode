class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num:nums) {
            set.add(num);
        }
        int[]b=new int[set.size()];
        int i=0;
        for (int num:set) {
            b[i++]=num;
        }
        Arrays.sort(b);
        return ((b.length>=3)?b[b.length-3]:b[b.length-1]);
    }
}