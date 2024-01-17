import java.util.*;

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> x = new Stack<>();
        int n = nums.length;
        int[] q = new int[n];
        Arrays.fill(q, -1);

        for (int i = 0; i < 2 * n; i++) {
            int cur = nums[i % n];
            
            while (!x.isEmpty() && cur > nums[x.peek()]) {
                q[x.pop()] = cur;
            }

            if (i < n) {
                x.push(i);
            }
        }

        return q;
    }
}