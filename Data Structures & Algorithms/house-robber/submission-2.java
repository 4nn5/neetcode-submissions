class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        
        if(nums.length == 2){
            return Math.max(nums[0], nums[1]);
        }

       
        int prev = nums[0];
        int curr = Math.max(nums[0], nums[1]);

        for(int i = 2; i < nums.length; i++){
           int curr1 = Math.max(curr, prev + nums[i]);
           prev = curr;
           curr = curr1;
        } 

        return curr;
    }
}
