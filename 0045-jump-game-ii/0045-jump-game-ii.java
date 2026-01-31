class Solution {
    public int jump(int[] nums) {
        int ans = 0;
        int end = 0;
        int farthest = 0;

        if (nums.length <= 1) return 0;

        for(int i = 0; i < nums.length; i++){
            farthest = Math.max(farthest, i + nums[i]);
            if(farthest >= nums.length - 1){
                ++ans;
                break;
            }
            if(i == end){
                ++ans;
                end = farthest;
            }
        }
        return ans;
    }
}