class Solution {
    public int compress(char[] chars) {
        int w = 0;
        int i = 0;

        while (i < chars.length) {
            char current = chars[i];
            int count = 0;

            while (i < chars.length && chars[i] == current) {
                count++;
                i++;
            }

            chars[w++] = current;

            if (count > 1) {
                for (char digit : String.valueOf(count).toCharArray()) {
                    chars[w++] = digit;
                }
            }
        }

        return w;
    }
}