class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] indexS = new int[200];
        int[] indexT = new int[200];
        int n = s.length();

        if(n != t.length()) {
            return false;
        }
        for(int i = 0; i < n; i++) {
            if(indexS[s.charAt(i)] != indexT[t.charAt(i)]) {
                return false;
            }
            indexS[s.charAt(i)] = i + 1;
            indexT[t.charAt(i)] = i + 1;
        }
        return true;
    }
}