class Solution {
    public int lengthOfLastWord(String s) {
        s = s.stripTrailing(); // Remove trailing spaces
        int length = 0;
        
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                if (length > 0) {
                    return length; // Return the length of the last word
                }
            } else {
                length++; // Increment length if character is not a space
            }
        }
        
        return length; // Return the length of the last word
    }
}
