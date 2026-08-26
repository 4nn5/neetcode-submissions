class Solution {
    public int climbStairs(int n) {
        if (n <= 2){
            return n;
        }

       int prev = 1;
       int curr = 2;
       int curr1 = 0;

       for(int i = 3; i <= n; i++){
        curr1 = prev + curr;
        prev = curr;
        curr = curr1;
       }

       return curr;
    }
}
