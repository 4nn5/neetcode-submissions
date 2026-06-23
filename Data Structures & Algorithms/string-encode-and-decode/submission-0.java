class Solution {

    public String encode(List<String> strs) {
        if (strs == null || strs.isEmpty()) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        for(String s: strs){
            sb.append(s.length()).append("#").append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();

        if (str == null || str.isEmpty()) {
            return result;
        }

        int  i = 0;

        while(i < str.length()){
            int pos = str.indexOf("#", i);
            int len = Integer.parseInt(str.substring(i, pos));
            i = pos + 1;

            String s = str.substring(i, i + len);
            result.add(s);

            i += len;

        }
        return result;
    }
}
