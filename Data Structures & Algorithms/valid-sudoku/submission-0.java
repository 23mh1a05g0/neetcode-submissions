class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            HashSet<Character> set = new HashSet<>();
            for(int j=0;j<9;j++){
                char val = board[i][j];

                if(val == '.') continue;
                else if(set.contains(val)) return false;
                else set.add(val);

            }
        }

        for(int j=0;j<9;j++){
            HashSet<Character> set = new HashSet<>();
            for(int i=0;i<9;i++){
                char val = board[i][j];

                if(val == '.') continue;
                else if(set.contains(val)) return false;
                else set.add(val);
            }
        }

        for(int boxrow = 0;boxrow < 3;boxrow++){
            for(int boxcol = 0;boxcol < 3;boxcol++){
                HashSet<Character> set = new HashSet<>();
                int startrow = boxrow * 3;
                int startcol = boxcol * 3;
                for(int row = startrow;row < startrow+3;row++){
                    for(int col = startcol;col < startcol+3;col++){
                         char val = board[row][col];
                         if(val == '.') continue;
                         else if(set.contains(val)) return false;
                         else set.add(val);
                    }
                }
            }
        }
        return true;
    }
}
