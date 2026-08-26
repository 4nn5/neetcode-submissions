class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }

        if(nums.length == 2){
            return Math.max(nums[0], nums[1]);
        }

        int max1 = robHelper(nums, 0, nums.length - 2);
        int max2 = robHelper(nums, 1, nums.length - 1);

        return Math.max(max1, max2);
    }

    public int robHelper(int[] nums, int start, int end){
        int curr = 0; 
        int prev = 0; 
        
        for (int i = start; i <= end; i++) {
            int currentMax = Math.max(curr, prev + nums[i]);
            
            prev = curr;
            curr = currentMax;
        }

        return curr;
    }
}
