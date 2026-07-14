class Solution {
    int dir[][]={
        {1,0},
        {-1,0},
        {0,1},
        {0,-1}
    };
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int m=grid1.length;
        int n=grid1[0].length;
        int c=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid2[i][j]==1){
                    if(dfs(grid2,i,j,grid1)){
                        c++;
                    }
                }
            }
        }
        return c;
    }
    private boolean dfs(int[][] grid2,int i,int j,int[][] grid1){
        int m=grid1.length;
        int n=grid1[0].length;
        if(i<0 || i>=m || j<0 || j>=n){
            return true;
        }
        if(grid2[i][j]==0){
            return true;
        }

        grid2[i][j]=0;
        boolean valid = grid1[i][j]==1;
        for(int[] d:dir){
            int ni=i+d[0];
            int nj=j+d[1];
            valid = dfs(grid2,ni,nj,grid1) && valid;
        }
       return valid;
    }
}