class Solution {
    public String reversePrefix(String word, char ch) {
        Stack<Character> stack = new Stack<>();
        int i = 0;

        while (i < word.length() && word.charAt(i) != ch) {
            stack.push(word.charAt(i));
            i++;
        }

        if (i == word.length()) {
            return word;
        }

        stack.push(word.charAt(i));

        StringBuilder sb = new StringBuilder();

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        for (int j = i + 1; j < word.length(); j++) {
            sb.append(word.charAt(j));
        }

        return sb.toString();
    }
}