public class Remove_K_Digits {
    public String removeKdigits(String num, int k) {
        if (k == num.length()) return "0";

        StringBuilder stack = new StringBuilder();

        for (char c : num.toCharArray()) {
            while (k > 0 && stack.length() > 0 && stack.charAt(stack.length() - 1) > c) {
                stack.deleteCharAt(stack.length() - 1);
                k--;
            }
            stack.append(c);
        }

        while (k > 0 && stack.length() > 0) {
            stack.deleteCharAt(stack.length() - 1);
            k--;
        }

        int index = 0;
        while (index < stack.length() && stack.charAt(index) == '0') {
            index++;
        }

        String result = (index == stack.length()) ? "0" : stack.substring(index);
        return result;
    }
}
