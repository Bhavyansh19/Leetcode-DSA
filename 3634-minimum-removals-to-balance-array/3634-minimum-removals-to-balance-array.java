class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 0;
        int left = 0;
        int maxWindow = 0;

        for(int right = 0; right < nums.length; right++){
            while(nums[right] > (long) nums[left] * k){
                left++;
            }
            maxWindow = Math.max(maxWindow,right - left + 1);
        }
        return nums.length - maxWindow;
    }
}