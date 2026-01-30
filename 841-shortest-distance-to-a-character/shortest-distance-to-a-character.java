class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] res = new int[n];
        int temp = -1;     
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == c) {
                temp = i;
                res[i] = 0;
            } else {
                if (temp == -1) {
                    res[i] = n + 1; 
                } else {
                    res[i] = i - temp;
                }
            }
        }
        temp = -1;    
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == c) {
                temp = i;
            } else {
                if (temp != -1) {
                    res[i] = Math.min(res[i], temp - i);
                }
            }
        }
        return res;
    }
}
