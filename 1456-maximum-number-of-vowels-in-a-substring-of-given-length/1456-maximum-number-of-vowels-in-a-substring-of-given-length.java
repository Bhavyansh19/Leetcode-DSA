class Solution {
    public int maxVowels(String s, int k) {
        byte[] isVowel = new byte['z' + 1];
        isVowel['a'] = 1;
        isVowel['e'] = 1;
        isVowel['i'] = 1;
        isVowel['o'] = 1;
        isVowel['u'] = 1;

        int max = 0, currentVowels = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < k; i++) {
            currentVowels += isVowel[chars[i]];
        }
        max = currentVowels;
        for (int i = k; i < chars.length; i++) {
            currentVowels += isVowel[chars[i]] - isVowel[chars[i - k]];
            max = Math.max(max, currentVowels);
        }
        return max;
    }
}