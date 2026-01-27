class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for(int num : nums){
            numSet.add(num);
        }

        int longest = 0;
        for(int num : numSet){
            if(!numSet.contains(num - 1)){
                int CurrentNum = num;
                int CurrentStreak = 1;

                while(numSet.contains(CurrentNum + 1)){
                    CurrentNum += 1;
                    CurrentStreak += 1;
                }
                longest = Math.max(longest, CurrentStreak);
            }
        }
        return longest;
    }
}