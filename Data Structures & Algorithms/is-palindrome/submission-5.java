class Solution {
    public boolean isPalindrome(String s) {
        
        StringBuilder cleaned = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (Character.isLetterOrDigit(current)) {
                cleaned.append(Character.toLowerCase(current));
            }
        }

        // Preserve the forward text before reverse mutates the builder.
        String forward = cleaned.toString();
        String backward = cleaned.reverse().toString();
        return forward.equals(backward);
        }
}
