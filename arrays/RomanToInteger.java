class Solution {
    public int romanToInt(String s) {
        int ans = 0;
        for(int i = 0; i < s.length(); i++){
            int cur = value(s.charAt(i));
            int next = 0;

            if(i + 1 < s.length()) {
                next = value(s.charAt(i + 1));
            }

            if (cur < next) {
                ans -= cur;
            } else {
                ans += cur;
            }
        }
        return ans;
    }

    private int value(char c){
        if (c == 'M') return 1000;
        if (c == 'D') return 500;
        if (c == 'C') return 100;
        if (c == 'L') return 50;
        if (c == 'X') return 10;
        if (c == 'V') return 5;
        if (c == 'I') return 1;
        return 0;
    }
}