class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dfs(board, word, 0, i, j)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, String word, int idx, int r, int c) {
        if (idx == word.length()) return true;
        if (r < 0 || r >= board.length || c < 0 || c >= board[0].length 
            || board[r][c] != word.charAt(idx)) {
            return false;
        }
        char temp = board[r][c];
        board[r][c] = '#';

        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
        for (int[] d : dirs) {
            if (dfs(board, word, idx + 1, r + d[0], c + d[1])) {
                board[r][c] = temp; 
                return true;
            }
        }
        board[r][c] = temp;
        return false;
    }
}
