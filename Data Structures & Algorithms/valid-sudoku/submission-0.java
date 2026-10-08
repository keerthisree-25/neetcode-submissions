class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer,HashSet<Character>> row=new HashMap<>();
        HashMap<Integer,HashSet<Character>> col=new HashMap<>();
        HashMap<Integer,HashSet<Character>> box=new HashMap<>();
        for(int i=0;i<9;i++){
            row.put(i,new HashSet<>());
            col.put(i,new HashSet<>());
            box.put(i,new HashSet<>());
        }
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char ch=board[i][j];
                if(ch=='.')
                continue;
                int idx=(i/3)*3+(j/3);
                if(row.get(i).contains(ch) || col.get(j).contains(ch) || box.get(idx).contains(ch))
                return false;
                row.get(i).add(ch);
                col.get(j).add(ch);
                box.get(idx).add(ch);
            }
        }
        return true;
    }
}
