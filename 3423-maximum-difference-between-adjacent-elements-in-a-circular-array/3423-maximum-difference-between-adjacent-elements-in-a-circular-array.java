class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int maxsum = 0;
        for(int i = 0; i < nums.length - 1; i++){
            maxsum = Math.max(maxsum, Math.abs(nums[i+1] - nums[i]));
        }
        maxsum = Math.max(maxsum, Math.abs(nums[nums.length -1] - nums[0]));
        return maxsum;
    }
}