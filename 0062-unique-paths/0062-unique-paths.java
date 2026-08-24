class Solution {
    public int uniquePaths(int m, int n) {
        int[][] t=new int[m][n]; //t[i][j]=> tot ways to reache i,j from 0,0

        t[0][0]=1;

        //fill 0th row
        for(int col=1; col<n; col++){
            t[0][col]=1;
        }

        //fill 0th col
        for(int row=1; row<m; row++){
            t[row][0]=1;
        }

        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                t[i][j]=t[i-1][j]+t[i][j-1];
            }
        }
        return t[m-1][n-1];
    }
}