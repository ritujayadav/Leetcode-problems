class Solution {
    public int myAtoi(String s) {
        char x[] = s.toCharArray();
        if (x.length == 0) return 0;
        long r = 0;
        int i = 0;
        int sn = 1;
        char c = x[i];

        // Skip leading whitespaces
        while (c == ' ') {
            i++;
            if (i < x.length) {
                c = x[i];
            } else {
                break;  // Added to handle case when there are only whitespaces in the input
            }
        }

        // Check for sign
        if (c == '-') {
            sn = -1;
            i++;
        } else if (c == '+') {
            sn = 1;
            i++;
        }

        // Process digits
        for (; i < x.length; i++) {
            c = x[i];
            if (c < '0' || c > '9') {
                break;
            } else {
                int digit = c - '0';

                // Check for overflow before updating the result
                if (r > (Integer.MAX_VALUE - digit) / 10) {
                    return (sn == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }

                r = r * 10 + digit;
            }
        }

        r *= sn;

        if (r > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (r < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        return (int) r;
    }
}
