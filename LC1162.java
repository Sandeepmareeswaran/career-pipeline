class Solution {
    public int maxDistance(int[][] grid) {
        int[][] dir={{1,0},{-1,0},{0,1},{0,-1}};
        int m=grid.length;
        int n=grid[0].length;
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    q.offer(new int[]{i,j});
                }
            }
        }
        if(q.isEmpty() || q.size()==m*n){
            return -1;
        }
        int dis=-1;
        while(!q.isEmpty()){
            int s=q.size();
            dis++;
            for(int i=0;i<s;i++){
                int[] cur = q.poll();
                int r=cur[0];
                int c=cur[1];
                for(int[] d:dir){
                    int nr=r+d[0];
                    int nc=c+d[1];
                    if(nr>=0 && nr<m && nc>=0 && nc<n && grid[nr][nc]==0){
                        grid[nr][nc]=1;
                        q.offer(new int[]{nr,nc});
                    }
                }
            }
        }
        return dis;
    }
}