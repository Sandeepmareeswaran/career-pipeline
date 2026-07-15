class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q=new LinkedList<>();
        int fresh=0;
        int time=0;
        int R=grid.length;
        int C=grid[0].length;
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                if(grid[i][j]==1){
                    fresh++;
                }
                if(grid[i][j]==2){
                    q.offer(new int[]{i,j});
                }
            }
        }
        int[][] dir={{0,1},{0,-1},{1,0},{-1,0}};
        while(!q.isEmpty() && fresh>0){
            int s=q.size();
            for(int i=0;i<s;i++){
                int[] cur=q.poll();
                int r=cur[0];
                int c=cur[1];
                for(int[] d:dir){
                    int row=r+d[0];
                    int col=c+d[1];
                    if(row<0 || row>=R || col<0 || col>=C || grid[row][col]!=1){
                        continue;
                    }
                    grid[row][col]=2;
                    fresh--;
                    q.offer(new int[]{row,col});
                }
            }
            time++;
        }
        return (fresh==0)?time:-1;
        
    }
}