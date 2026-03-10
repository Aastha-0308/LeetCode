class Solution {
    public int[] shuffle(int[] nums, int n) {
        int ans[] = new int[2 * n];
        int j = 0;
        for(int k = 0; k < nums.length; k++){
            if(k % 2 == 0){
                ans[k] = nums[j++];
            } else {
                ans[k] = nums[n++];
            }
        }

        return ans;
    }

}