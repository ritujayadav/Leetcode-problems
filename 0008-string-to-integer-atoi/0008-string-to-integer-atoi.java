class Solution {
    public int myAtoi(String s) {
        char x[] = s.toCharArray();
        if (x.length == 0) return 0;
        long r = 0;
        int i = 0;
        int sn = 1;
        char c = x[i];

        while (c == ' ') {
            i++;
            if (i < x.length) {
                c = x[i];
            } else {
                break;  
            }
        }

        if (c == '-') {
            sn = -1;
            i++;
        } else if (c == '+') {
            sn = 1;
            i++;
        }

        for (; i < x.length; i++) {
            c = x[i];
            if (c < '0' || c > '9') {
                break;
            } else {
                int digit = c - '0';

               
                if (r > (Integer.MAX_VALUE - digit) / 10) {
                    return (sn == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }

                r = r * 10 + digit;
            }
        }

        r *= sn;
        return (int) r;
    }
}
