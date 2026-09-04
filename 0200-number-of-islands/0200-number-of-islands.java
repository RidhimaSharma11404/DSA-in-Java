class Solution {
    public int numIslands(char[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        int count = 0;

        int[][] dir = {
            {1,0},
            {-1,0},
            {0,1},
            {0,-1}
        };

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {

                // Found a new island
                if(grid[i][j] == '1') {

                    count++;

                    Queue<int[]> q = new LinkedList<>();
                    q.add(new int[]{i,j});

                    // Mark visited
                    grid[i][j] = '0';

                    while(!q.isEmpty()) {

                        int[] curr = q.poll();

                        int r = curr[0];
                        int c = curr[1];

                        for(int[] d : dir) {

                            int nr = r + d[0];
                            int nc = c + d[1];

                            if(nr >= 0 && nr < n &&
                               nc >= 0 && nc < m &&
                               grid[nr][nc] == '1') {

                                grid[nr][nc] = '0';

                                q.add(new int[]{nr,nc});
                            }
                        }
                    }
                }
            }
        }

        return count;
    }
}