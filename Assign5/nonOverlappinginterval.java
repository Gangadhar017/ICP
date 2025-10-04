class Solution {
    public int eraseOverlapIntervals(int[][] iv) {
        if (iv.length == 0) return 0;
        Arrays.sort(iv, (a, b) -> a[1] - b[1]);
        int rem = 0;
        int end = iv[0][1];
        for (int i = 1; i < iv.length; i++) {
            if (iv[i][0] < end) rem++;
            else end = iv[i][1];
        }
        return rem;
    }
}
