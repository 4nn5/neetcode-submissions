class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hmap = new HashMap<>();

        for(String s: strs){
            char[] word = s.toCharArray();
            Arrays.sort(word);
            String sign = new String(word);

            if(!hmap.containsKey(sign)){
                hmap.put(sign, new ArrayList<>());
            }

            hmap.get(sign).add(s);
        }

        return new ArrayList(hmap.values());
    }
}
