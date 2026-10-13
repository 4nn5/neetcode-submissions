class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(ans, new ArrayList<>(), nums, 0);
        return ans;
    }

    public void backtrack (List<List<Integer>> ans, List<Integer> result, int[] nums, int start){
        ans.add(new ArrayList<>(result));

        for(int i = start; i< nums.length; i++){
            result.add(nums[i]);

            backtrack(ans, result, nums, i + 1);

            result.remove(result.size() - 1);
        }
    }
}
