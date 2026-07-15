class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int[][] dir={{1,0},{-1,0},{0,1},{0,-1},{1,1},{-1,-1},{1,-1},{-1,1}};
        int n=grid.length;
        Queue<int[]> q=new LinkedList<>();
        boolean[][] vis=new boolean[n][n];
        if(grid[0][0]==1 || grid[n-1][n-1]==1){
            return -1;
        }
        q.offer(new int[]{0,0,1});
        vis[0][0]=true;
        while(!q.isEmpty()){
            int[] cur=q.poll();
            int r=cur[0];
            int c=cur[1];
            int l=cur[2];
            if(r==n-1 && c==n-1){
                return l;
            }
            for(int[] d:dir){
                int nr=r+d[0];
                int nc=c+d[1];
                if(nr>=0 && nr<n && nc>=0 && nc<n && grid[nr][nc]==0 && !vis[nr][nc]){
                    vis[nr][nc]=true;
                    q.offer(new int[]{nr,nc,l+1});
                }
            }
        }
        return -1;

    }
}