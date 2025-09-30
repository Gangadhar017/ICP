boolean searchMatrix(int[][] mat, int t) {
    int r=searchPR(mat, t);
    if (r!= -1) return binarySearchOR(r, mat, t);
    else return false;
}
// potential row search......... if target 16 >10 annd 16<23 
//previous last and agle ka first element 
public int searchPR(int[][] mat, int t) {
    int l =0;
    int h= mat.length - 1;
    while (l <= h){
        int m =(l + h)/2;

        if (mat[m][0] <= t && t <= mat[m][mat[0].length - 1]) {
            return m;
        }
        else if (mat[m][0]< t) l = m + 1;
        else if (mat[m][0]> t) h = m - 1;
    }
    return -1;
}
//binary search over that row  so we can get element.....nhi toh false 
//mil gya to true
public boolean binarySearchOR(int r, int[][] mat, int t) {
    int lo =0;
    int hi =mat[r].length-1;
    while (lo <= hi) {
        int m = (lo + hi) / 2;

        if(mat[r][m] == t) return true;
        else if(mat[r][m] > t) hi= m - 1;
        else lo = m + 1;
    }
    return false;
}
