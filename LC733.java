class Solution {
    int[][] dir={{1,0},{-1,0},{0,1},{0,-1}};
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m=image.length;
        int n=image[0].length;
        Queue<int[]>q=new LinkedList<>();
        if(image[sr][sc]==color){
            return image;
        }
        int og=image[sr][sc];
        image[sr][sc]=color;
        q.offer(new int[]{sr,sc});
        
        bfs(image,color,q,og);
        
        return image;
    }
    private void bfs(int[][] image,int color,Queue<int[]> q,int og){
        int m=image.length;
        int n=image[0].length;
        while(!q.isEmpty()){
            int[] cur = q.poll();
            int r=cur[0];
            int c=cur[1];
            
            for(int[] d:dir){
                int nr=r+d[0];
                int nc=c+d[1];
                if(nr>=0 && nr<m && nc>=0 && nc<n && image[nr][nc]==og){
                    image[nr][nc]=color;
                    q.offer(new int[]{nr,nc});
                }
            }
        }
    }
}