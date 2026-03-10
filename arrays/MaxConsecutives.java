class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int consOnes = 0;
        int maxOnes = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] == 0){
                if(consOnes > maxOnes){
                maxOnes = consOnes;
                }
                consOnes = 0;
            } else {
                consOnes++;
            }
        }
        return Math.max(consOnes, maxOnes);
    }
}