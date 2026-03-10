class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        boolean[] seen = new boolean[n + 1];

        for (int val : nums) {
            seen[val] = true;
        }

        List<Integer> missing = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (!seen[i]) {
                missing.add(i);
            }
        }

        return missing;
    }
}
