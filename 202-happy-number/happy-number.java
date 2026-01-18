class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();

        while (n != 1) {
            if (set.contains(n)) {
                return false; // loop mil gaya
            }
            set.add(n);
            n = nextNumber(n);
        }
        return true;
    }

    int nextNumber(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum = sum + digit * digit;
            n = n / 10;
        }
        return sum;
    }
}
