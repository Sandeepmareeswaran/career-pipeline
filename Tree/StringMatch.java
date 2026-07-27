import java.util.*;

public class StringMatch {

    static char[][] grid = {
            {'A','Z','T','E','C'},
            {'O','Z','O','N','E'},
            {'H','O','M','E','S'},
            {'S','O','L','I','D'}
    };

    static int r = grid.length;
    static int c = grid[0].length;

    static String target = "ZOHO";

    static boolean[][] vis = new boolean[r][c];

    static List<int[]> path = new ArrayList<>();

    // Left, Down, Right, Up
    static int[][] dir = {
            {0,-1},
            {1,0},
            {0,1},
            {-1,0}
    };

    static boolean dfs(int i,int j,int ind){

        // Entire word matched
        if(ind == target.length()){
            return true;
        }

        // Boundary check
        if(i<0 || i>=r || j<0 || j>=c){
            return false;
        }

        // Already visited
        if(vis[i][j]){
            return false;
        }

        // Character mismatch
        if(grid[i][j] != target.charAt(ind)){
            return false;
        }

        // Mark visited
        vis[i][j] = true;

        // Store 1-based coordinates
        path.add(new int[]{i+1,j+1});

        // Try all four directions
        for(int[] d : dir){

            int nr = i + d[0];
            int nc = j + d[1];

            if(dfs(nr,nc,ind+1)){
                return true;
            }
        }

        // Backtracking
        vis[i][j] = false;
        path.remove(path.size()-1);

        return false;
    }

    public static void main(String[] args){

        boolean found = false;

        for(int i=0;i<r && !found;i++){

            for(int j=0;j<c && !found;j++){

                if(grid[i][j] == target.charAt(0)){

                    if(dfs(i,j,0)){
                        found = true;
                    }

                }

            }

        }

        if(found){

            System.out.print("Path : ");

            for(int[] p : path){

                System.out.print("[" + p[0] + "," + p[1] + "] ");

            }

        }
        else{

            System.out.println("Path not found");

        }

    }

}