class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int j = 0;
        int sum = 0;
        int mn = Integer.MAX_VALUE;
        
        while (j < nums.length) {
            sum += nums[j];
            while (sum >= target) {
                mn = Math.min(mn, j - i + 1);
                sum -= nums[i];
                i++;
            }
            j++;
        }
        return (mn == Integer.MAX_VALUE) ? 0 : mn;
    }
}
