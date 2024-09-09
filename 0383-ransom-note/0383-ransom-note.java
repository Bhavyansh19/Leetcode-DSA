class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int n = ransomNote.length();
        int m = magazine.length();
        char[] ch1 = ransomNote.toCharArray();
        char[] ch2 = magazine.toCharArray();
        int[] hash = new int[26];

        for (int i = 0; i < m; i++) {
            hash[ch2[i] - 'a']++;
        }
        for (int i = 0; i < n; i++) {
            hash[ch1[i] - 'a']--;
            if (hash[ch1[i] - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}