class Solution {
    public boolean isPalindrome(String s) {
        
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            // Skip characters excluded by the problem's normalization rule.
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // There is no remaining pair to compare.
            if (left >= right) {
                return true;
            }

            char leftChar = Character.toLowerCase(s.charAt(left));
            char rightChar = Character.toLowerCase(s.charAt(right));
            if (leftChar != rightChar) {
                return false;
            }

            left++;
            right--;
        }
        return true;
    }
}
