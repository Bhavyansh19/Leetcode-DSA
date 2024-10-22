class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxlength = 0;
        int[] charIndex = new int[128];
        Arrays.fill(charIndex, -1);
        int j = 0;

        for(int i = 0; i < n; i++) {
            if(charIndex[s.charAt(i)] >= j) {
                j = charIndex[s.charAt(i)] +1;
            }
            charIndex[s.charAt(i)] = i;
            maxlength = Math.max(maxlength, i - j + 1);
        }
        return maxlength;
    }
}