class Solution {
    public int minOperations(int[] nums, int k) {
        int n = nums.length;
        int sum = 0;
        int count = 0;
        for(int i = 0; i < n; i++){
            sum += nums[i];
        }
        while(sum % k != 0){
            sum--;
            count++;
        }
        return count;
    }
}