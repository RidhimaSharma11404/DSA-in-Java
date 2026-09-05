class Solution {
    public int longestIncreasingPath(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] indegree = new int[n][m];
        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){

                for(int[] d:dir){

                    int nr=i+d[0];
                    int nc=j+d[1];

                    if(nr>=0 && nr<n && nc>=0 && nc<m
                            && matrix[nr][nc] > matrix[i][j]){

                        indegree[nr][nc]++;
                    }
                }
            }
        }
        Queue<int[]> q = new LinkedList<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){

                if(indegree[i][j]==0){
                    q.add(new int[]{i,j});
                }
            }
        }
        int ans = 0;

        while(!q.isEmpty()){

            int size = q.size();

            for(int k=0;k<size;k++){

                int[] curr=q.poll();

                int r=curr[0];
                int c=curr[1];
                for(int[] d:dir){
                    int nr=r+d[0];
                    int nc=c+d[1];
                    if(nr>=0 && nr<n && nc>=0 && nc<m
                            && matrix[nr][nc] > matrix[r][c]){
                        indegree[nr][nc]--;
                        if(indegree[nr][nc]==0){
                            q.add(new int[]{nr,nc});
                        }
                    }
                }
            }
            ans++;
        }
        return ans;
    }
}