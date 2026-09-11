class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(ans, new ArrayList<>(), nums, 0);
        return ans;
    }

    public void backtrack(List<List<Integer>> ans, List<Integer> current, int[] nums, int start){

        ans.add(new ArrayList<>(current));

        for(int i = start; i < nums.length; i++){
            current.add(nums[i]);
            backtrack(ans, current, nums,  i + 1);
            current.remove(current.size() - 1);

        }
    }
}
