class Solution {
    public boolean isAnagram(String s, String t) {
if (s == null || t == null || s.length() != t.length()) {
            return false;
        }

        int[] charCounts = new int[26];

        for (int index = 0; index < s.length(); index++) {
            charCounts[s.charAt(index) - 'a']++;
            charCounts[t.charAt(index) - 'a']--;
        }

        for (int count : charCounts) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}
