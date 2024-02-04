class Solution {
    public int myAtoi(String s) {
        char x[] = s.toCharArray();
        if (x.length == 0) return 0;
        long r = 0;
        int i = 0;
        int sn = 1;
        char c = x[i];

        // Skip leading whitespaces
        while (i < x.length && x[i] == ' ') {
            i++;
        }

        // Check for sign
        if (i < x.length && (x[i] == '-' || x[i] == '+')) {
            sn = (x[i++] == '-') ? -1 : 1;
        }

        // Process digits
        while (i < x.length && Character.isDigit(x[i])) {
            int digit = x[i] - '0';

            // Check for overflow before updating the result
            if (r > (Integer.MAX_VALUE - digit) / 10) {
                return (sn == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            r = r * 10 + digit;
            i++;
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

