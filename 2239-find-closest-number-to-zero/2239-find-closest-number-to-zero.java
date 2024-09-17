class Solution {
    public int findClosestNumber(int[] nums) {
        int closest = nums[0];
        for (int i : nums) {
            if (Math.abs(i) < Math.abs(closest)) {
                closest = i;
            }
            else if (Math.abs(i) == Math.abs(closest) && i > closest) {
                closest = i;
            }
        }
        return closest;
    }
}