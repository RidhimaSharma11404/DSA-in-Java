class Solution {
    public int[][] updateMatrix(int[][] mat) {

        int n = mat.length;
        int m = mat[0].length;

        int[][] dist = new int[n][m];
        for(int i = 0; i < n; i++) {
            Arrays.fill(dist[i], -1);
        }
        Queue<int[]> q = new LinkedList<>();
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {

                if(mat[i][j] == 0) {
                    q.add(new int[]{i,j});
                    dist[i][j] = 0;
                }
            }
        }

        int[][] dir = {
            {1,0},
            {-1,0},
            {0,1},
            {0,-1}
        };

        while(!q.isEmpty()) {

            int[] curr = q.poll();

            int r = curr[0];
            int c = curr[1];

            for(int[] d : dir) {

                int nr = r + d[0];
                int nc = c + d[1];

                if(nr >= 0 && nr < n &&
                   nc >= 0 && nc < m &&
                   dist[nr][nc] == -1) {

                    dist[nr][nc] = dist[r][c] + 1;

                    q.add(new int[]{nr,nc});
                }
            }
        }

        return dist;
    }
}