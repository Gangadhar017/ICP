class Solution {

    public void spiralOrder(int[][] m) {
        int rb =0;
        int re =m.length - 1;
        int cb =0;
        int ce =m[0].length - 1;

        while (rb <= re && cb <= ce) {
            // Right -------.> travewrse
            for (int j = cb; j <= ce; j++) {
                System.out.print(m[rb][j] + " ");
            }
            rb++;

            // than Down traverse 
            for (int j = rb; j <= re; j++) {
                System.out.print(m[j][ce] + " ");
            }
            ce--;

            // phir Left traverse
            if (rb <= re) {
                for (int j = ce; j >= cb; j--) {
                    System.out.print(m[re][j] + " ");
                }
            }
            re--;

            // traverse up
            if (cb <= ce) {
                for (int j = re; j >= rb; j--) {
                    System.out.print(m[j][cb] + " ");
                }
            }
            cb++;
          //wapas se same  
        }
    }
}
