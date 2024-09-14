class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for(int a = 0; a < numbers.length; a++ ){
            for(int b = a + 1; b < numbers.length; b++) {
                if(numbers[a] + numbers[b] == target) {
                    return new int[]{a+1, b+1};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}