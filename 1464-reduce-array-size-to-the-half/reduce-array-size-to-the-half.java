class Solution {
    public int minSetSize(int[] arr) {
        int n = arr.length;
        int target = n / 2;

        Map<Integer, Integer> map = new HashMap<>();
        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        int[] freq = new int[map.size()];
        int idx = 0;
        for (int f : map.values()) {
            freq[idx++] = f;
        }

        Arrays.sort(freq);   

        int removed = 0;
        int count = 0;

        for (int i = freq.length - 1; i >= 0; i--) {
            removed += freq[i];
            count++;

            if (removed >= target)
                break;
        }

        return count;
    }
}
