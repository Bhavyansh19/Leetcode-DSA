class Solution {
    public String reverseVowels(String s) {
        char[] word = s.toCharArray();
        int i = 0;
        int end = s.length() - 1;
        String vowels = "aeiouAEIOU";
        
        while (i < end) {
            while (i < end && vowels.indexOf(word[i]) == -1) {
                i++;
            }
            while (i < end && vowels.indexOf(word[end]) == -1) {
                end--;
            }
            char temp = word[i];
            word[i] = word[end];
            word[end] = temp;

            i++;
            end--;
        }
        
        String answer = new String(word);
        return answer;
    }
}