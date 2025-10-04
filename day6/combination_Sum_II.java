class Solution {
    public List<List<Integer>> combinationSum2(int[] nums, int tgt) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        dfs(0, nums, tgt, res, new ArrayList<>());
        return res;
    }

    static void dfs(int idx, int[] a, int tgt, List<List<Integer>> res, List<Integer> cur) {
        if (tgt == 0) {
            res.add(new ArrayList<>(cur));
            return;
        }

        for (int i = idx; i < a.length; i++) {
            if (i > idx && a[i] == a[i - 1]) continue;
            if (a[i] > tgt) break;

            cur.add(a[i]);
            dfs(i + 1, a, tgt - a[i], res, cur);
            cur.remove(cur.size() - 1);
        }
    }
}
