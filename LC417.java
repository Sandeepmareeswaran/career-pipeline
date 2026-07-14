class Solution {
    int[][] dir={
        {1,0},
        {-1,0},
        {0,1},
        {0,-1}
    };
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int m=heights.length;
        int n=heights[0].length;
        boolean[][] pacific=new boolean[m][n];
        boolean[][] atlandic = new boolean[m][n];

        for(int j=0;j<n;j++){
            dfs(heights,0,j,pacific);
        }
        for(int i=0;i<m;i++){
            dfs(heights,i,0,pacific);
        }
        for(int j=0;j<n;j++){
            dfs(heights,m-1,j,atlandic);
        }
        for(int i=0;i<m;i++){
            dfs(heights,i,n-1,atlandic);
        }
        
        List<List<Integer>> lst = new ArrayList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(pacific[i][j] && atlandic[i][j]){
                    List<Integer> ls =  new ArrayList<>();
                    ls.add(i);
                    ls.add(j);
                    lst.add(ls);
                }
            }
        }
        return lst;


        
    }
    private void dfs(int[][] height,int i,int j,boolean[][] vis){
        int m=height.length;
        int n=height[0].length;
        if(vis[i][j]){
            return;
        }
        vis[i][j]=true;

        for(int[] d:dir){
            int ni=i+d[0];
            int nj = j+d[1];
            if(ni>=0 && ni<m && nj>=0 && nj<n && !vis[ni][nj] && height[ni][nj]>=height[i][j]){
                dfs(height,ni,nj,vis);
            }
        }

    }

}