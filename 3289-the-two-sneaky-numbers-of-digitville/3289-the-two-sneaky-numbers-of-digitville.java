class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int n = nums.length -2;
        int[] result = new int[2];
        int[] count = new int[n+2];

        for(int num : nums) {
            count[num]++;
        }
        int index = 0;
        for (int i = 0; i <= n; i++) {
            if (count[i] == 2) {
                result[index++] = i;
            }
        }
        return result;
    }
}