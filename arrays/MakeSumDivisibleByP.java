class Solution {
    public int minSubarray(int[] nums, int p) {
        int n = nums.length;
        int target = 0;
        for(int i = 0; i < n; i++){
            target += nums[i];
            target %= p;
        }
        // int target = sum % p;
        if(target == 0){
            return 0;
        }
        Map<Integer, Integer> lastSeen = new HashMap<>();
        lastSeen.put(0, -1);
        int min = n;
        int currPre = 0;
        for(int i = 0; i < n; i++){
            currPre = (currPre + nums[i]) % p;
            int targetNum = (currPre - target + p) % p;

            if(lastSeen.containsKey(targetNum)){
                int subArray = i - lastSeen.get(targetNum);
                min = Math.min(min, subArray);
            }

            lastSeen.put(currPre, i);
            
        }
        if(min == n){
            return -1;
        }
        
        return min;
    }
}