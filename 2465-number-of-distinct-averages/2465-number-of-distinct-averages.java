class Solution {
public int distinctAverages(int[] nums) {
Arrays.sort(nums);
Set s = new HashSet<>();
for (int i = 0; i < nums.length / 2; i++) {
s.add((nums[i] + nums[nums.length - 1 - i]) / 2.0);
}
return s.size();
}
}