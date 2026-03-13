class Solution {
    public boolean check(int[] nums) {
        int breaks = 0;
        int n = nums.length;

        if(nums[n - 1] > nums[0]){
                breaks++;
            }
        for(int i = 0; i < n - 1; i++){
            if(nums[i] > nums[i + 1]){
                breaks++;
            }

        }

        return breaks <= 1;
    }
}