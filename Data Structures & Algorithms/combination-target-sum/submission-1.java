class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums, target, 0, 0);
        return result;        
    }

    public void backtrack(List<List<Integer>> result, List<Integer> ans, int[] nums, int target, int sum, int start){

        if(sum == target){
            result.add(new ArrayList<>(ans));
            return;
        }

        if(sum > target){
            return;
        }

        for(int i = start; i < nums.length; i++){
            ans.add(nums[i]);
            sum += nums[i];
            backtrack(result, ans, nums, target, sum, i);
            ans.remove(ans.size() - 1);
            sum -= nums[i];

        }

    }
}
