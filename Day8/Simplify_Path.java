import java.util.Stack;

class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] parts = path.split("/");

        for (String part : parts) {
            if (part.equals("") || part.equals(".")) {
                // skip empty or current dir
                continue;
            } else if (part.equals("..")) {
                // go one directory up
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                // valid directory
                stack.push(part);
            }
        }

        // build simplified path
        StringBuilder sb = new StringBuilder();
        for (String dir : stack) {
            sb.append("/").append(dir);
        }

        return sb.length() > 0 ? sb.toString() : "/";
    }
}
