class Solution {
    public boolean exist(char[][] board, String word) {
        int m=board.length;
        int n=board[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                char f=word.charAt(0);
                if(f==board[i][j]){
                    if(dfs(board,i,j,word,0)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    private boolean dfs(char[][] board,int i,int j,String word,int ind){
        int m=board.length;
        int n=board[0].length;
        int wl=word.length();
        if(i<0 || i>=m || j<0 || j>=n ){
            return false;
        }
        if(word.charAt(ind)!=board[i][j]){
            return false;
        }
        if( ind==word.length()-1){
            return true;
        }
        
        char temp = board[i][j];
        board[i][j]='#';
        boolean found = dfs(board,i+1,j,word,ind+1) ||
        dfs(board,i-1,j,word,ind+1) || dfs(board,i,j+1,word,ind+1) || 
        dfs(board,i,j-1,word,ind+1);

        board[i][j]=temp;
        return found;
    }
}