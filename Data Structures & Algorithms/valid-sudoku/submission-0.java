class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> rows = new HashSet<>();
        HashSet<String> cols = new HashSet<>();
        HashSet<String> boxes = new HashSet<>();

        for (int r = 0; r < 9; r++){
            for (int c = 0; c < 9; c++){
                char num = board[r][c];

                if (num == '.') continue;

                String rowKey = num + " in row " + r;
                String colKey = num + " in col " + c;

                int boxIndex = (r / 3) * 3 + (c / 3);
                String boxKey = num + " in box " + boxIndex;

                if (rows.contains(rowKey) || cols.contains(colKey) || boxes.contains(boxKey)) return false;

                rows.add(rowKey);
                cols.add(colKey);
                boxes.add(boxKey);
            }
        }

        return true;
    }
}
