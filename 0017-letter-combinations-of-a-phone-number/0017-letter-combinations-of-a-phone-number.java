class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) return new ArrayList<>();
        
        String[] phoneMap = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> output = new ArrayList<>();
        backtrack(0, digits, phoneMap, new StringBuilder(), output);
        return output;
    }

    private void backtrack(int index, String digits, String[] phoneMap, StringBuilder combination, List<String> output) {
        if (index == digits.length()) {
            output.add(combination.toString());
            return;
        }
        
        String letters = phoneMap[digits.charAt(index) - '2'];
        for (char letter : letters.toCharArray()) {
            combination.append(letter);
            backtrack(index + 1, digits, phoneMap, combination, output);
            combination.deleteCharAt(combination.length() - 1);
        }
    }
}
