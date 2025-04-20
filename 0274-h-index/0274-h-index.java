import java.util.Arrays;

public class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        int result = 0;

        for (int i = 0; i < n; i++) {
            int h = n - i;
            if (citations[i] >= h) {
                result = h;
                break;
            }
        }
        return result;
    }
}