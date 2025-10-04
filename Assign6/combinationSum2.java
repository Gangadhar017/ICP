class Solution {
    public List<List<Integer>> combinationSum2(int[] a, int t) {
        List<List<Integer>> res = new ArrayList<>();
        ArrayList<Integer> cur = new ArrayList<>();
        Arrays.sort(a);
        dfs(a, t, 0, cur, res);
        return res;
    }

    private void dfs(int[] a, int t, int ind, ArrayList<Integer> cur, List<List<Integer>> res) {
        if (t == 0) {
            res.add(new ArrayList<>(cur));
            return;
        }

        for (int i = ind; i < a.length; i++) {
            if (i > ind && a[i] == a[i - 1]) continue;
            if (a[i] > t) break;

            cur.add(a[i]);
            dfs(a, t - a[i], i + 1, cur, res);
            cur.remove(cur.size() - 1);
        }
    }
}
