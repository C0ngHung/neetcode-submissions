class Solution {

    public String encode(List<String> strs) {   

        StringBuilder sb = new StringBuilder();

        for (String s : strs) {

            sb.append(s.length()) // Ghi độ dài chuỗi
            .append('#')            // Separator giữa length và content
            .append(s);             // Ghi nội dung chuỗi
        }

        return sb.toString();

    }

    public List<String> decode(String str) {

        List<String> result = new ArrayList<>();

        int i = 0;

        while ( i < str.length() ) {

            // Tìm vị trí '#' — separator giữa length và content
            int j = str.indexOf('#', i);

            // Đọc length từ vị trí i đến j-1
            int length = Integer.parseInt(str.substring(i, j));

            // Đọc đúng 'length' ký tự bắt đầu từ j+1
            String s = str.substring( j + 1, j + 1 + length );
            result.add(s);

            // Di chuyển con trỏ đến chuỗi tiếp theo
            i = j + 1 + length;
        }

        return result;

    }
}
