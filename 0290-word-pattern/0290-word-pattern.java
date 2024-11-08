class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) {
            return false;
        }

        Map<Character, String> map = new HashMap<>();
        Map<String, Character> reverseMap = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];
            if (map.containsKey(c) && !map.get(c).equals(word)) {
                return false;
            }
            if (reverseMap.containsKey(word) && reverseMap.get(word) != c) {
                return false;
            }
            map.put(c, word);
            reverseMap.put(word, c);
        }
        return true;
    }
}
