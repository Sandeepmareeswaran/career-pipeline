class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> lst = new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;
        int t=0;
        int b=m-1;
        int l=0;
        int r=n-1;
        while(t<=b && l<=r){
            for(int j=l;j<=r;j++){
                lst.add(matrix[t][j]);
            }
            t++;
            for(int i=t;i<=b;i++){
                lst.add(matrix[i][r]);
            }
            r--;
            if(t<=b){
                for(int j=r;j>=l;j--){
                    lst.add(matrix[b][j]);
                }
                b--;
            }
            if(l<=r){
                for(int i=b;i>=t;i--){
                    lst.add(matrix[i][l]);
                }
                l++;
            }
        }
        return lst;
    }
}