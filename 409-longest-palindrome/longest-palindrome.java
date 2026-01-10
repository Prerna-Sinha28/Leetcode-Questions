class Solution {
    public int longestPalindrome(String s) {
        int[] freq = new int[128];  // ASCII

        // Step 1: count frequency
        for (char ch : s.toCharArray()) {
            freq[ch]++;
        }

        int length = 0;
        boolean hasOdd = false;

        // Step 2: calculate palindrome length
        for (int count : freq) {
            if (count % 2 == 0) {
                length += count;
            } else {
                length += count - 1;
                hasOdd = true;
            }
        }

        // Step 3: center character
        if (hasOdd) length += 1;

        return length;
    }
}
