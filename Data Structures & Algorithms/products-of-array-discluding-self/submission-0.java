class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int[] prefix = new int[n];
        int[] suffix = new int[n];
        int[] ans = new int[n];

        int prod = 1;
        prefix[0] = 1;

        for(int  i = 0; i < n - 1; i ++){
            prod *= nums[i];
            prefix[i + 1] = prod;
        }

        for(int i = 0; i < n; i ++){
            System.out.print(prefix[i] + " ");
        }

        prod = 1;
        suffix[n - 1] = 1;

        for(int i = n - 1; i > 0; i--){
            prod *= nums[i];
            suffix[i - 1] = prod;
        }

        for(int i = 0; i < n; i ++){
            System.out.print(suffix[i] + " ");
        }
    
        for(int i = 0; i < n; i++){
            ans[i] = prefix[i] * suffix[i];
        }

        return ans;
    }
}  
