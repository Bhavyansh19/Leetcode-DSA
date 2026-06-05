class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        int index = 0;

        for(int i = 0; i < n; i++){
            index = index^nums[i];
        }
        return index;
    }
}