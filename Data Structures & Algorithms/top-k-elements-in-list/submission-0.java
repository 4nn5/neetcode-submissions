class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> ans = new HashMap<>();

        for(int num: nums){
            ans.put(num, ans.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> ans.get(a) - ans.get(b));

        for(int num: ans.keySet()){
            heap.add(num);
            if(heap.size() > k){
                heap.poll();
            }
        }
        
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = heap.poll();
        }
        return result;

    }
}
