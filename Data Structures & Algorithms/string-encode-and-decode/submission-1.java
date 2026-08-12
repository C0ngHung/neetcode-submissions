class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for (String s : strs) {
            sb.append(s.length()).append('#').append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String strs) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while(i < strs.length()) {
            int j = i;
            while(strs.charAt(j) != '#') {
                j++;
            }
            int length = Integer.parseInt(strs.substring(i, j));
            String s = strs.substring(j + 1, j + 1 + length);
            result.add(s);
            i = j + 1 + length;
        }
        return result;
    }
}
