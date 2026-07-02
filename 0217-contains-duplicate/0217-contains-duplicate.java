class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        Set<Integer> repeat = new HashSet<>();

        for(int i = 0; i < n; i++){
            if(repeat.contains(nums[i])){
                return true;
            }
            repeat.add(nums[i]);
        }
        return false;
    }
}