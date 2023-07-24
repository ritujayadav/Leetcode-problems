class Solution {
    public int maxProductDifference(int[] s) {
        Arrays.sort(s);
        return s[s.length - 1] * s[s.length - 2] - s[0] * s[1];
    }
}