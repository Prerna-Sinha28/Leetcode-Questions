class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int n=s.length();
        int cost =0;
        int len=0;
        int j=0;
        for(int i=0; i<n; i++){
            cost=cost+Math.abs(s.charAt(i)-t.charAt(i));
            while(cost>maxCost){
                cost=cost-Math.abs(s.charAt(j)-t.charAt(j));
                j++;
            }
            len=Math.max(len, i-j+1);
        }
        return len;
    }
}