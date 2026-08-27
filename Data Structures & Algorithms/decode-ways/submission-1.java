class Solution {
    public int numDecodings(String s) {
        if(s == null || s.length() < 1 || s.charAt(0) == '0'){
            return 0;
        }

        int n = s.length();

        int prev = 1;
        int curr = 1;

        for(int i = 2; i <= n; i++){
            int curr1 = 0;
            int oneDigit = Integer.parseInt(s.substring(i - 1, i));
            if(oneDigit >= 1 && oneDigit <= 9){
                curr1 += curr;
            }

            int twoDigit = Integer.parseInt(s.substring(i - 2, i));
            if(twoDigit >= 10 && twoDigit <= 26){
                curr1 += prev;
            }

            prev = curr;
            curr = curr1;
        }

        return curr;
    }
}
