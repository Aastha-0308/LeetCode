class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] seen = new int[n + 1];
        int missing = 0, duplicate = 0;
        for(int i = 0; i < n; i++){
            seen[nums[i]] += 1;
        }
        for(int i = 1; i <= n; i++){
            if(seen[i] == 0){
                missing = i;
            }
            if(seen[i] == 2){
                duplicate = i;
            }
        }

        
        return new int[]{duplicate, missing};
    }
}