class Solution {
    public boolean isAnagram(String s, String t) {
        
        if (s.length() != t.length()) return false;

        Map<Character, Integer> countMapS = new HashMap<>();

        Map<Character, Integer> countMapt = new HashMap<>();

        char[] sArr = s.toCharArray();

        char[] tArr = t. toCharArray();

        for (char c : sArr) {

            countMapS.put(c, countMapS.getOrDefault(c, 0) + 1);
        }

        for (char c : tArr) {

            countMapt.put(c, countMapt.getOrDefault(c, 0) + 1);
        }

        return (countMapS.equals(countMapt));
    }

}
